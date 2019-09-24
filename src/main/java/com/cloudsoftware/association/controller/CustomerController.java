package com.cloudsoftware.association.controller;

import com.cloudsoftware.association.domain.Customer;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;


@RestController
@RequestMapping("/api")
public class CustomerController {

    ConcurrentHashMap<String, Customer> customers = new ConcurrentHashMap<>();


    @GetMapping("/{id}")
    @ApiOperation(value = "Finds Customer by id",
        notes = "Provide an id to look up specific customer from the database",
            response = Customer.class
    )
    public Customer getCustomer(@ApiParam(value = "ID value for the customer you need to retrieve", required = true) @PathVariable String id) {
        return customers.get(id);
    }


    @GetMapping("/")
    public List<Customer> getAllCustomers() {
        return new ArrayList<Customer>(customers.values());

    }

    @PostMapping("/")
    public Customer addCustomer(@RequestBody Customer customer) {
        System.out.println("sucess");
        customers.put(customer.getId(), customer);
        return customer;
    }
}
