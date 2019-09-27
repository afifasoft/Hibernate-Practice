package com.cloudsoftware.association.domain1;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class CompoundKey implements Serializable {

    private int userId;
    private int accountId;

    public CompoundKey(int userId, int accountId) {
        this.userId = userId;
        this.accountId = accountId;
    }
}
