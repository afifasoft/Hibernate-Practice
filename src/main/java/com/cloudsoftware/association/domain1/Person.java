package com.cloudsoftware.association.domain1;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Person {

    @Id
    @GeneratedValue
    private int personId;
    private String personName;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "pDetail_FK")
    private PersonDetail personDetail;
}
