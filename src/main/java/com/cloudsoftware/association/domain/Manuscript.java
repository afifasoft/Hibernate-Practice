package com.cloudsoftware.association.domain;

import javax.persistence.*;

@Entity
public class Manuscript {

    @Id
    @GeneratedValue
    private Long id;

    private byte[] file;

//    @OneToOne(fetch = FetchType.LAZY)
 //   @JoinColumn(name = "fk_book")

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private Book book;


}
