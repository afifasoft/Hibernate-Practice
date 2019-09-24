package com.cloudsoftware.association.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


// 75
// 3.3.1 Annotation-based metadata
@Entity
public class BidItem {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;
    private BigDecimal initialPrice;
    private Date auctionEnd;

   // @OneToMany
  //  protected Set<Bid> bids = new HashSet<Bid>();

//    public Set<Bid> getBids() {
//        return bids;
//    }

//    public void setBids(Set<Bid> bids) {
//        this.bids = bids;
//    }


    // calculate the shipping cost
    // calculate the tax

    // many-to-one --> this association between the two classes allows bidirectional navigation
            // whenever you create bidirectional link, two actions are required
            // 1. You must add the Bid to the bids collection of the Item
            // 2. The item property of the Bid must be set.

    // one-to-many --> one item can have many bids

/*
    public void addBid(Bid bid) {
        if (bid == null) {
            throw new NullPointerException("Can't add null Bid");
        }

        if (bid.getBidItem() != null) {
            throw  new IllegalArgumentException("Bid is already assigned to an Item");
        }


        getBids().add(bid);
        bid.setBidItem(this);
    }
*/

}
