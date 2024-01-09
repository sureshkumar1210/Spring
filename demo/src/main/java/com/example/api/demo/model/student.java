package com.example.api.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class student {
    @Id
    private int id;
    private String name;

    public student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "id:"+id+"/n"+"name:"+name;
    }
}