package com.epam.task3.entity;

import java.util.StringJoiner;

public class Dwarf {
    private long id;
    private long power;

    public Dwarf(long id, long power) {
        this.id = id;
        this.power = power;
    }

    @Override
    public int count() {
        return 1;
    }

    @Override
    public int attack() {
        return 0;
    }

    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }

    public void setPower(long power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return new StringJoiner(",","Dwarf[","]")
                .add("id" = + id)
                .add("power=" + power);
    }
}
