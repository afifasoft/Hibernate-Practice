package com.cloudsoftware.association;

import com.cloudsoftware.association.domain.Product;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AssociationOneToOneApplicationTests {

	Logger log = Logger.getLogger(this.getClass().getName());


	private EntityManagerFactory emf;

	@Test
	public void contextLoads() {
		log.info("loading....");
	}

	@Test
	public void testPersist() {
		log.info("... testPersist() ...");

		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Product product = new Product();
		product.setPrice(19.990);
		//product.setNameEn("BMW");
		//product.setNameAr("BMW");

		em.persist(product);

		em.getTransaction().commit();
		em.close();
	}

}
