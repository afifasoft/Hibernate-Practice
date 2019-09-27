package com.cloudsoftware.association.domain1;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Data
@Entity
public class Event {

    @Id
    @GeneratedValue
    private int eventId;
    private String eventName;

    @ManyToMany
    @JoinTable(name = "JOIN_DELEGATE_EVENT",
            joinColumns = {@JoinColumn(name="eventId")},
            inverseJoinColumns = {@JoinColumn(name="delegateId")}
    )
    private List<Delegate> delegates = new ArrayList<Delegate>();
}
