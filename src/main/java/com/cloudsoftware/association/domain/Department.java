package com.cloudsoftware.association.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Department {

    @Id
    @GeneratedValue
    @Column(name = "department_id")
    private Integer id;

    private String name;

    @Column(name = "business_group_id")
    private int businessGroupId;





}
