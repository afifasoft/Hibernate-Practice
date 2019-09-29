package com.cloudsoftware.association;

import com.cloudsoftware.association.domain.*;
import com.cloudsoftware.association.domain1.*;
import com.cloudsoftware.association.domain1.Event;
import com.cloudsoftware.association.domainbrain.UserDetails;
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

        {
            CompoundKey compoundKey = new CompoundKey(100, 10001);
            Accounts accounts = new Accounts();
            accounts.setCompoundKey(compoundKey);
            accounts.setAccountBalance(8500);


            CompoundKey compoundKey1 = new CompoundKey(100, 20001);
            Accounts accounts1 = new Accounts();
            accounts1.setCompoundKey(compoundKey1);
            accounts1.setAccountBalance(2500);

            session.save(accounts);
            session.save(accounts1);

        }

        {
            Projects projects = new Projects();
            projects.setProjectName("Hibernate Lessons");

            Module module = new Module();
            module.setProjectName("Spring Lessons");
            module.setModuleName("AOP");

            Task task = new Task();
            task.setProjectName("Java Lessons");
            task.setModuleName("Collections");
            task.setTaskName("ArrayList");

            session.save(projects);
            session.save(module);
            session.save(task);
        }

        {
            PersonDetail personDetail = new PersonDetail();
            personDetail.setZipCode("20815");
            personDetail.setJob("Accountant");
            personDetail.setIncome(67555.45);


            Person person = new Person();
            person.setPersonName("Alex");
            person.setPersonDetail(personDetail);

            session.save(person);


        }

        {
            College college = new College();
            college.setCollegeName("NewYork College");


            Student student = new Student();
            student.setStudentName("Alex Rod");

            Student student1 = new Student();
            student1.setStudentName("Linda Berry");

            student.setCollege(college);
            student1.setCollege(college);

            session.save(college);
            session.save(student);
            session.save(student1);

        }

        {
            Delegate delegate = new Delegate();
            delegate.setDelegateName("Alex Rod");

            Delegate delegate1 = new Delegate();
            delegate1.setDelegateName("Linda Berry");

            Delegate delegate2 = new Delegate();
            delegate2.setDelegateName("John Doe");

            Delegate delegate3 = new Delegate();
            delegate3.setDelegateName("James Dean");

            Event event = new Event();
            event.setEventName("Java  - 101");

            Event event1 = new Event();
            event1.setEventName("C++ - 101");

            Event event2 = new Event();
            event2.setEventName("Math - 101");

            event.getDelegates().add(delegate);
            event.getDelegates().add(delegate1);
            event.getDelegates().add(delegate2);

            event1.getDelegates().add(delegate1);
            event1.getDelegates().add(delegate2);

            event2.getDelegates().add(delegate3);

            session.save(event);
            session.save(event1);
            session.save(event2);

            session.save(delegate);
            session.save(delegate1);
            session.save(delegate2);
            session.save(delegate3);



        }

        {
            UserDetails userDetails = new UserDetails();
            userDetails.setUserName("Abdul");

            session.save(userDetails);

        }



        session.save(user);
        session.getTransaction().commit();
        session.close();

    }
}
