package com.cloudsoftware.association.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Event {

    @Id
    public Long id;

    public String eventName;

    @OneToMany
    public Set<Participant> participantSet = new HashSet<Participant>();


}
