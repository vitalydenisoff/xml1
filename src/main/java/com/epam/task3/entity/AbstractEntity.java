package com.epam.task3.entity;

import java.util.StringJoiner;

public class AbstractEntity {
    private long id;

    public AbstractEntity(long id) {
        this.id = id;
    }
    public AbstractEntity() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", "[", "]")
                .add("id=" + id)
                .toString();
    }
}
