package com.cloudsoftware.association.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Participant {

    @Id
    public Long id;

    public String name;
}
