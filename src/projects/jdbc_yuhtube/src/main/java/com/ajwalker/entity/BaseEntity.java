package com.ajwalker.entity;

public class BaseEntity {
    protected Long id;
    protected char state;


    public BaseEntity() {
    }

    public BaseEntity(char state) {
        this.state = state;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public char getState() {
        return state;
    }

    public void setState(char state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "id=" + id +
                ", state=" + state +
                '}';
    }
}
