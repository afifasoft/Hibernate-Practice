package com.cloudsoftware.association.domain;

import javax.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne(mappedBy = "book", fetch = FetchType.LAZY, optional = false)
    private Manuscript manuscript;

    @Version
    private int version;

    private String title;
}
