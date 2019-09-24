package com.cloudsoftware.association.domain;

import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Bid {

    @Id
    private Integer id;

   /* @ManyToOne
    protected BidItem bidItem;

    public Bid(BidItem bidItem) {

        this.bidItem = bidItem;
        bidItem.getBids().add(this);  // Bidirectional

    }

    public BidItem getBidItem() {
        return bidItem;
    }

    public void setBidItem(BidItem bidItem) {
        this.bidItem = bidItem;
    }*/
}
