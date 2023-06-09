package ru.faang.school.task_2;

import java.util.Map;

public class DataCenterService {

    private DataCenter dataCenter;


    public DataCenterService(DataCenter dataCenter) {
        this.dataCenter = dataCenter;
    }

    public void addServer(String serverName, Server server){
        dataCenter.getAllServers().put(serverName + " " + server.getUniqueID(),server);
    }

    public void removeServer(String serverName){
        dataCenter.getAllServers().remove(serverName);
    }

    public double getTotalEnergyConsumption(){
        double totalEnergyConsumption = 0;
        for(Map.Entry<String,Server> entry: dataCenter.getAllServers().entrySet()){
            totalEnergyConsumption = entry.getValue().getCurrentEnergyConsumption();
        }
        return totalEnergyConsumption;
    }

    public void allocateResources(ResourceRequest request){
        double requestLoad = request.getLoad();
        double freeResources = dataCenter.getFreeResources();
        if (freeResources > requestLoad){
            for (Map.Entry<String,Server> entry: dataCenter.getAllServers().entrySet()){
                double freeLoad = entry.getValue().getFreeLoad();
                if (requestLoad - freeLoad <= 0){
                    entry.getValue().setLoad(entry.getValue().getLoad() + requestLoad);
                    break;
                } else {
                    entry.getValue().setLoad(entry.getValue().getLoad() + entry.getValue().getFreeLoad());
                    requestLoad -= freeLoad;
                }
            }
        } else {
            System.out.println("All servers is overload");
        }
    }

    public void releaseResources(ResourceRequest request){
        Server server = dataCenter.getLoadServer();
        if (server != null){
            server.setLoad(server.getLoad() - request.getLoad());
        } else {
            System.out.println("All servers is free");
        }
    }
}
