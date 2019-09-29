package com.cloudsoftware.association.domain1;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="event_id")
    private int eventId;
    private String eventName;

    @ManyToMany
    @JoinTable(name = "JOIN_DELEGATE_EVENT",
            joinColumns = {@JoinColumn(name="event_id")},
            inverseJoinColumns = {@JoinColumn(name="delegate_Id")}
    )
    private List<Delegate> delegates = new ArrayList<Delegate>();
}
