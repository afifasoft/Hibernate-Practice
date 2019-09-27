package com.cloudsoftware.association.domain1;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Data
@Entity
public class Delegate {

    @Id
    @GeneratedValue
    private int delegateId;
    private String delegateName;

    @ManyToMany
    @JoinTable(name = "JOIN_DELEGATE_EVENT",
        joinColumns = {@JoinColumn(name = "delegateId")},
            inverseJoinColumns = {@JoinColumn(name = "eventId")}
    )
    private List<Event> events = new ArrayList<Event>();

}
