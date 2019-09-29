package com.cloudsoftware.association.domain1;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Data
@Entity
public class Delegate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="delegate_Id")
    private int delegateId;
    private String delegateName;

    @ManyToMany
    @JoinTable(name = "JOIN_DELEGATE_EVENT",
        joinColumns = {@JoinColumn(name = "delegate_Id")},
            inverseJoinColumns = {@JoinColumn(name = "event_id")}
    )
    private List<Event> events = new ArrayList<Event>();

}
