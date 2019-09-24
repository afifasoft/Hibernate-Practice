package com.cloudsoftware.association.domain;


import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class ProductTest {

    Logger log = Logger.getLogger(this.getClass().getName());


    private EntityManagerFactory emf;


    @Before
    public void init() {
        emf = Persistence.createEntityManagerFactory("my-persistence-unit");
    }

    @After
    public void close() {
        emf.close();
    }

    @Test
    public void testPersist() {
        log.info("... testPersist() ...");

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Product product = new Product();
        product.setPrice(19.990);
      //  product.setNameEn("BMW");
      //  product.setNameAr("BMW");

        em.persist(product);

        em.getTransaction().commit();
        em.close();
    }
}
