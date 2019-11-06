package com.sbt.lesson2;

public abstract class ClientImpl {
    private Long id;

    public abstract String getFullName();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;

    }
}
