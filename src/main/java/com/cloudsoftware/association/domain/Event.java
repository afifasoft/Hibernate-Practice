package com.cloudsoftware.association.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;


public class Event {


    public Long id;

    public String eventName;

    public Set<Participant> participantSet = new HashSet<Participant>();


}
