package com.cloudsoftware.association.domain1;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;

@Entity
@Table(name = "EmployeeInfo")   // All are converted into
public class EmpPerson {

    @Id
    @GeneratedValue

    private int empId;


    @Column(name = "EmployeeName")
    private String empName;

    @Transient
    private String empPassword;

    @Column(nullable = false)
    private String empEmailAddress;

    @Basic
    private boolean isPermanent;

    @Temporal(TemporalType.DATE)
    private Calendar empJoinDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date empLoginTime;      // coming to office - timing

    public String getEmpPassword() {
        return empPassword;
    }

    public void setEmpPassword(String empPassword) {
        this.empPassword = empPassword;
    }

    public String getEmpEmailAddress() {
        return empEmailAddress;
    }

    public void setEmpEmailAddress(String empEmailAddress) {
        this.empEmailAddress = empEmailAddress;
    }

    public boolean isPermanent() {
        return isPermanent;
    }

    public void setPermanent(boolean permanent) {
        isPermanent = permanent;
    }

    public Calendar getEmpJoinDate() {
        return empJoinDate;
    }

    public void setEmpJoinDate(Calendar empJoinDate) {
        this.empJoinDate = empJoinDate;
    }

    public Date getEmpLoginTime() {
        return empLoginTime;
    }

    public void setEmpLoginTime(Date empLoginTime) {
        this.empLoginTime = empLoginTime;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
}
