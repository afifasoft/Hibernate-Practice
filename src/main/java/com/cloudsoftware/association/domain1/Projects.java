package com.cloudsoftware.association.domain1;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Projects {

    @Id
    @GeneratedValue
    private int projectId;
    private String projectName;

}
