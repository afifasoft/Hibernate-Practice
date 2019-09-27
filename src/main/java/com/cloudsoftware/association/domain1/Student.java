package com.cloudsoftware.association.domain1;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Student {

    @Id
    @GeneratedValue
    private int studentId;
    private String studentName;

    @ManyToOne
    @JoinColumn(name = "college_id") // any name you can give
    private College college;

}
