package com.yk.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 部门类
 */
@Data
public class Department implements Serializable {

    private Integer id;
    private String name;
    private Integer parentid;
    private String deppath;
    private Boolean enabled;
    private Boolean isparent;

    // 子类
    private List<Department> children = new ArrayList<>();

    // 结果
    private Integer result;

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public void setDeppath(String deppath) {
        this.deppath = deppath == null ? null : deppath.trim();
    }

    public Department() {
    }

    public Department(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }

}