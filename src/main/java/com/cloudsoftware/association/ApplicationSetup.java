package com.cloudsoftware.association;

import com.cloudsoftware.association.domain.*;
import com.cloudsoftware.association.domain1.EmpPerson;
import com.cloudsoftware.association.domain1.PosCustomer;
import com.cloudsoftware.association.domain1.School;
import com.cloudsoftware.association.domain1.SchoolDetails;
import com.cloudsoftware.association.repository.MessageRepository;
import com.cloudsoftware.association.repository.ProductRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import javax.persistence.PersistenceUnit;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

@Component
public class ApplicationSetup implements CommandLineRunner {

    @Autowired
    public ProductRepository productRepository;

    @Autowired
    private MessageRepository messageRepository;


    @PersistenceUnit
    EntityManagerFactory emf;

   @Autowired
   EntityManager em;

  //  SessionFactory sessionFactory;


    @Override
    public void run(String... args) throws Exception {
        System.out.println("running...");
        Product product = new Product();
        product.setPrice(19.990);
     //   product.setNameEn("BMW");
      //  product.setNameAr("BMW");

      //  LocalizedProduct lpAr = new LocalizedProduct();

        productRepository.save(product);

      //   em = emf.createEntityManager();
        Message message = new Message();
        message.setText("Hello");
        System.out.println(message.getText());

        Message message2 = new Message();
        message2.setText("How");
        System.out.println(message2.getText());




        messageRepository.save(message);
        messageRepository.save(message2);
        // JPQL (Java Persistence Query Language )
        List<Message> messages = em.createQuery("select m from Message m").getResultList();


        for (int i = 0; i < messages.size(); i++) {
            System.out.println(messages.get(i).getText());
        }


     //   UserTransaction tx = TM.getUserTranscation();


     //   List<Message> newMessage = sessionFactory.getCurrentSession().createCriteria(Message.class).list();
        // SELECT * from MESSAGE

        // assertEquals(newMessage.size(), 1);
        // asserEquals(newMessage.get(0).getText(), "Hello World!");
        // tx.commit();

     //   System.out.println(newMessage);


       // em.persist(message);

      //  em.close();

        User user = new User();
        user.setName("user");


        SessionFactory sessionFactory = emf.unwrap(SessionFactory.class);

        Session session = sessionFactory.openSession();
        session.beginTransaction();


        {
            EmpPerson empPerson = new EmpPerson();
            empPerson.setEmpName("Abdul");
            empPerson.setEmpEmailAddress("abdul.pesit@gmail.com");
            empPerson.setEmpPassword("abdulpass");
            empPerson.setPermanent(true);
            empPerson.setEmpJoinDate(new GregorianCalendar(2019, 9, 24));
            empPerson.setEmpLoginTime(new Date());
            session.save(empPerson);

        }
        {
            EmpPerson emp = new EmpPerson();
            emp.setEmpName("Harish");
            emp.setEmpEmailAddress("chanti@gmail.com");
            emp.setEmpPassword("har123");
            emp.setPermanent(true);
            emp.setEmpJoinDate(new GregorianCalendar(2019, 2, 23));
            emp.setEmpLoginTime(new Date());
            session.save(emp);
        }

        {
            PosCustomer posCustomer = new PosCustomer();
            posCustomer.setCustomerName("Chanti");
            posCustomer.setCustomerAddress("202 Washington at DC");
            posCustomer.setCreditScore(780);
            posCustomer.setRewardPoints(12000);
            session.save(posCustomer);
        }

        {
            SchoolDetails schoolDetails = new SchoolDetails();
            schoolDetails.setPublicSchool(false);
            schoolDetails.setSchoolAddress("101 washington DC");
            schoolDetails.setStudentCount(230);

            School school = new School();
            school.setSchoolName("St. Anns School");
            school.setSchoolDetails(schoolDetails);
            session.save(school);
        }

        session.save(user);
        session.getTransaction().commit();
        session.close();






    }
}
