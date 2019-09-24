package com.cloudsoftware.association.domain1;

import lombok.Data;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;

@Data
@Entity
@Table(name = "EmployeeInfo")   // All are converted into
public class EmpPerson {

    @Id
    //@TableGenerator(name="empid", table="emppktb", pkColumnName = "empkey", pkColumnValue="empvalue", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO)
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


}
