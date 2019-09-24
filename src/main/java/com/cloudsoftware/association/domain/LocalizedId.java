package com.cloudsoftware.association.domain;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import java.io.Serializable;
import java.util.Objects;


public class LocalizedId implements Serializable {

    private static final long serialVersionUID = 10897237273727L;

    private Long id;

    public LocalizedId(String locale) {
        this.locale = locale;
    }

    private String locale;


}
