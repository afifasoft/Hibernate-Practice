package com.cloudsoftware.association.domainbrain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class UserDetails {

    @Id
    @GeneratedValue
    private int userId;
    private String userName;




}
