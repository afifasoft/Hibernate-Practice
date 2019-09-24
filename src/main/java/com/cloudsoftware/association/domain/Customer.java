package com.cloudsoftware.association.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@ApiModel(description = "Details about the customer")
public class Customer {

    @ApiModelProperty(notes = "The unique id of the customer")
    private String id;

    @ApiModelProperty(notes = "The customer's name")
    private String name;

    @ApiModelProperty(notes = "The customer's phone number")
    private String phone;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
