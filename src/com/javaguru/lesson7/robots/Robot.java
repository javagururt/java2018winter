package com.javaguru.lesson7.robots;

class Robot {

    private Service service;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    void turnOn() {
        service.execute();
    }
}
