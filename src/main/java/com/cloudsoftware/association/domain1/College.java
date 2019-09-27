package com.cloudsoftware.association.domain1;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class College {

    @Id
    @GeneratedValue
    private int collegeId;
    private String collegeName;

    @OneToMany(targetEntity = Student.class, mappedBy = "college", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Student> students;
}
