package ru.faang.school.task_2;

import java.util.List;

public class LoadBalancingOptimizationStrategy implements OptimizationStrategy{

    @Override
    public void optimize(DataCenter dataCenter) {
        List<Server> halfLoadServers = dataCenter.getHalfLoadServers();
        if ((!halfLoadServers.isEmpty()) && (halfLoadServers.size() % 2) == 0) {
            for (int i = 1; i < halfLoadServers.size(); i += 2) {
                halfLoadServers.get(i).setLoad(halfLoadServers.get(i).getLoad() + halfLoadServers.get(i -1).getLoad());
            }
            for (int i = 0; i < halfLoadServers.size(); i += 2) {
                halfLoadServers.get(i).setLoad(0);
            }
        }
        removeFreeServers(dataCenter);
    }
    private void removeFreeServers(DataCenter dataCenter){
        for (String serverName : dataCenter.getFreeServersNames()){
            dataCenter.getAllServers().remove(serverName);
        }
    }
}
