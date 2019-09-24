package com.cloudsoftware.association.domain1;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Customer")
@SecondaryTable(name="CustomerDetail")
public class PosCustomer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerId;
    private String customerName;

    @Column(table = "CustomerDetail")
    private String customerAddress;

    @Column(table = "CustomerDetail")
    private int creditScore;

    @Column(table = "CustomerDetail")
    private int rewardPoints;

}
