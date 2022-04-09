package com.yk.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 员工类
 */
@Data
public class Employee  implements Serializable {

    private Integer id;
    private String name;
    private String gender;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone ="GMT+8" )
    private Date birthday;
    private String idcard;
    private String wedlock;
    private Integer nationid;
    private String nativeplace;
    private Integer politicid;
    private String email;
    private String phone;
    private String address;
    private Integer departmentid;
    private Integer joblevelid;
    private Integer posid;
    private String engageform;
    private String tiptopdegree;
    private String specialty;
    private String school;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone ="GMT+8" )
    private Date begindate;
    private String workstate;
    private String workid;
    private Double contractterm;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone ="GMT+8" )
    private Date conversiontime;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone ="GMT+8" )
    private Date notworkdate;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone ="GMT+8" )
    private Date begincontract;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone ="GMT+8" )
    private Date endcontract;
    private Integer workage;

    private Nation nation;
    private Politicsstatus politicsstatus;
    private Position position;
    private Department department;
    private JobLevel jobLevel;
    private Appraise appraise;
    private Salary salary;
    private Employeetrain employeetrainList;

    private List<Employeeec> employeeecList;
    private List<Employeeremove> employeeremoveList;

    public Employee(Integer id, Date notworkdate) {
        this.id = id;
        this.notworkdate = notworkdate;
    }

    public Employee() {
    }

    public Employee(Integer id, String name, String gender, Date birthday, String idcard, String wedlock, Integer nationid, String nativeplace, Integer politicid, String email, String phone, String address, Integer departmentid, Integer joblevelid, Integer posid, String engageform, String tiptopdegree, String specialty, Salary salary, String school, Date begindate, String workstate, String workid, Double contractterm, Date conversiontime, Date notworkdate, Date begincontract, Date endcontract, Integer workage, Nation nation, Politicsstatus politicsstatus, Position position, Department department, JobLevel jobLevel) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.idcard = idcard;
        this.wedlock = wedlock;
        this.nationid = nationid;
        this.nativeplace = nativeplace;
        this.politicid = politicid;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.departmentid = departmentid;
        this.joblevelid = joblevelid;
        this.posid = posid;
        this.engageform = engageform;
        this.tiptopdegree = tiptopdegree;
        this.specialty = specialty;
        this.salary = salary;
        this.school = school;
        this.begindate = begindate;
        this.workstate = workstate;
        this.workid = workid;
        this.contractterm = contractterm;
        this.conversiontime = conversiontime;
        this.notworkdate = notworkdate;
        this.begincontract = begincontract;
        this.endcontract = endcontract;
        this.workage = workage;
        this.nation = nation;
        this.politicsstatus = politicsstatus;
        this.position = position;
        this.department = department;
        this.jobLevel = jobLevel;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public void setWedlock(String wedlock) {
        this.wedlock = wedlock == null ? null : wedlock.trim();
    }

    public void setNativeplace(String nativeplace) {
        this.nativeplace = nativeplace == null ? null : nativeplace.trim();
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public void setEngageform(String engageform) {
        this.engageform = engageform == null ? null : engageform.trim();
    }

    public void setTiptopdegree(String tiptopdegree) {
        this.tiptopdegree = tiptopdegree == null ? null : tiptopdegree.trim();
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty == null ? null : specialty.trim();
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public void setWorkstate(String workstate) {
        this.workstate = workstate == null ? null : workstate.trim();
    }

    public void setWorkid(String workid) {
        this.workid = workid == null ? null : workid.trim();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                ", idcard='" + idcard + '\'' +
                ", wedlock='" + wedlock + '\'' +
                ", nationid=" + nationid +
                ", nativeplace='" + nativeplace + '\'' +
                ", politicid=" + politicid +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", departmentid=" + departmentid +
                ", joblevelid=" + joblevelid +
                ", posid=" + posid +
                ", engageform='" + engageform + '\'' +
                ", tiptopdegree='" + tiptopdegree + '\'' +
                ", specialty='" + specialty + '\'' +
                ", salary=" + salary +
                ", school='" + school + '\'' +
                ", begindate=" + begindate +
                ", workstate='" + workstate + '\'' +
                ", workid='" + workid + '\'' +
                ", contractterm=" + contractterm +
                ", conversiontime=" + conversiontime +
                ", notworkdate=" + notworkdate +
                ", begincontract=" + begincontract +
                ", endcontract=" + endcontract +
                ", workage=" + workage +
                ", nation=" + nation +
                ", politicsstatus=" + politicsstatus +
                ", position=" + position +
                ", department=" + department +
                ", jobLevel=" + jobLevel +
                '}';
    }
}