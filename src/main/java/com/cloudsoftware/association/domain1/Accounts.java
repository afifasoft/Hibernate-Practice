package com.cloudsoftware.association.domain1;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Accounts {

    @Id
    CompoundKey compoundKey;
    private int accountBalance;
}
