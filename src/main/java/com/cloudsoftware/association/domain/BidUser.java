package com.cloudsoftware.association.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class BidUser implements Serializable {

    protected String username;
    protected String firstname;
    protected String lastname;

    protected String[] names = new String[0];

    public BidUser() {

    }

    public String getUsername() {
        return firstname + ' '+ lastname;
    }

    public void setUsername(String username) {

        StringTokenizer tokenizer = new StringTokenizer(username);
        firstname = tokenizer.nextToken();
        lastname = tokenizer.nextToken();

    }

    public String getFirstname() {
        return new String(firstname);
    }

    public String getLastname() {
        return new String(lastname);
    }

    public void setNames(List<String> names) {
        this.names = names.toArray(new String[names.size()]);
    }

    public List<String> getNames() {
        return Arrays.asList(names);
    }


    public BigDecimal calcShippingCosts(BidAddress  fromLocation) {
        // Empty implementation of business method

        return null;
    }

    // ... calculate tax

}
