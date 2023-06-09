package ru.faang.school.task_2;

import lombok.Getter;

@Getter
public class ResourceRequest {

    private double load;

    public ResourceRequest(double load) {
        if (load < 0){
            throw new RuntimeException("Load can't be negative");
        }
        this.load = load;
    }
}
