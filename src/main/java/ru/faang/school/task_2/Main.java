package ru.faang.school.task_2;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        DataCenter dataCenter = new DataCenter();
        DataCenterService dataCenterService = new DataCenterService(dataCenter);
        LoadBalancingOptimizationStrategy strategy = new LoadBalancingOptimizationStrategy();
        dataCenterService.addServer("IBM Server", new IbmServer());
        dataCenterService.addServer("IBM Server", new IbmServer());
        dataCenterService.addServer("IBM Server", new IbmServer());
        dataCenterService.addServer("IBM Server", new IbmServer());
        dataCenterService.addServer("Dell Server", new DellServer());
        dataCenterService.addServer("Dell Server", new DellServer());
        dataCenterService.addServer("IBM Server", new IbmServer());
        dataCenterService.addServer("IBM Server", new IbmServer());
        dataCenterService.allocateResources(new ResourceRequest(200));
        dataCenterService.allocateResources(new ResourceRequest(200));
        dataCenterService.allocateResources(new ResourceRequest(600));
        dataCenterService.allocateResources(new ResourceRequest(1000));
        dataCenterService.allocateResources(new ResourceRequest(2000));

        System.out.println("before optimize:");
        for (Map.Entry <String,Server> entry : dataCenter.getAllServers().entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue().getLoad());
        }

        strategy.optimize(dataCenter);

        System.out.println("after optimize:");
        for (Map.Entry <String,Server> entry : dataCenter.getAllServers().entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue().getLoad());
        }
    }
}
