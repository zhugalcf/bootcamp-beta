package ru.faang.school.task_2;

import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
public class DataCenter {

    private Map<String,Server> allServers = new HashMap<>();

    public double getFreeResources(){
        double freeResources = 0;
        for (Map.Entry<String,Server> entry: allServers.entrySet()){
            freeResources += entry.getValue().getFreeLoad();
        }
        return freeResources;
    }

    public List<String> getFreeServersNames(){
        List<String> freeServers = new ArrayList<>();
        for (Map.Entry<String,Server> entry: allServers.entrySet()){
            if (entry.getValue().getLoad() == 0){
                freeServers.add(entry.getKey());
            }
        }
        return freeServers;
    }

    public Server getLoadServer(){
        for (Map.Entry<String,Server> entry: allServers.entrySet()){
            if (entry.getValue().getLoad() > 0){
                return entry.getValue();
            }
        }
        return null;
    }

    public List<Server> getHalfLoadServers(){
        List<Server> halfLoadServers = new ArrayList<>();
        for (Map.Entry<String,Server> entry: allServers.entrySet()){
            if (entry.getValue().getLoadCoefficient() <= 0.5){
                halfLoadServers.add(entry.getValue());
            }
        }
        return halfLoadServers;
    }
}
