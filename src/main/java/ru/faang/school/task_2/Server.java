package ru.faang.school.task_2;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

public abstract class Server {

    @Getter @Setter
    private double load;
    private double maxLoad;
    private double maxEnergyConsumption;
    @Getter
    private String uniqueID = UUID.randomUUID().toString();

    public Server(double maxLoad, double maxEnergyConsumption) {
        this.load = 0;
        this.maxLoad = maxLoad;
        this.maxEnergyConsumption = maxEnergyConsumption;
    }

    public double getCurrentEnergyConsumption(){
        return maxEnergyConsumption * getLoadCoefficient();
    }

    public double getFreeLoad(){
        return maxLoad - load;
    }

    public double getLoadCoefficient(){
        return load/maxLoad;
    }
}
