package com.yk.entity;

import lombok.Data;

import java.util.List;

/**
 * 菜单类
 */
@Data
public class Menu {

    private Integer id;
    private String url;
    private String path;
    private String component;
    private String name;
    private String iconcls;
    private  Meta meta;
    private Integer parentid;
    private Boolean enabled;

    private List<Menu> children;
    private List<Role> roles;

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public void setComponent(String component) {
        this.component = component == null ? null : component.trim();
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public void setIconcls(String iconcls) {
        this.iconcls = iconcls == null ? null : iconcls.trim();
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", path='" + path + '\'' +
                ", component='" + component + '\'' +
                ", name='" + name + '\'' +
                ", iconcls='" + iconcls + '\'' +
                ", meta=" + meta +
                ", parentid=" + parentid +
                ", enabled=" + enabled +
                ", children=" + children +
                ", roles=" + roles +
                '}';
    }
}