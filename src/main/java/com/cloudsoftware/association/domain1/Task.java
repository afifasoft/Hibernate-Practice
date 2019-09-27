package com.cloudsoftware.association.domain1;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Task extends Module {

    private String taskName;
}
