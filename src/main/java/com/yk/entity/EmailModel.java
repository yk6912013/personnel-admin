package com.yk.entity;

import lombok.Data;

/**
 * 邮件模型
 */
@Data
public class EmailModel {

    private Employee employee;
    private String title;
    private String content;
    private String path;
    private String toEmail;

    public EmailModel() {
    }

    public EmailModel(Employee employee, String title, String content, String path) {
        this.employee = employee;
        this.title = title;
        this.content = content;
        this.path = path;
    }
    public EmailModel(Employee employee, String title, String path) {
        this.employee = employee;
        this.title = title;
        this.path = path;
    }

    public EmailModel(String title, String content, String path,String toEmail) {
        this.title = title;
        this.content = content;
        this.path = path;
        this.toEmail = toEmail;
    }

    @Override
    public String toString() {
        return "EmailModel{" +
                "employee=" + employee +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", path='" + path + '\'' +
                '}';
    }
}
