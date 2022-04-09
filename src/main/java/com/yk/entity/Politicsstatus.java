package com.yk.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

/**
 * 政治面貌类
 */
@Data
public class Politicsstatus implements Serializable {

    private Integer id;
    private String name;

    public Politicsstatus(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Politicsstatus that = (Politicsstatus) o;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public Politicsstatus() {
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}