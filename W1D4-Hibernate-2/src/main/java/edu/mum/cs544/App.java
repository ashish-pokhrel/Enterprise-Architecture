package edu.mum.cs544;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.Date;
import java.util.List;

public class App {
    private static EntityManagerFactory emf;

    public static void main(String[] args) {
        try {
            getTransaction();
            setTransaction(12);
            getTransaction();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void getTransaction() {
        emf = Persistence.createEntityManagerFactory("simpsons");
        EntityManager em = emf.createEntityManager();
        //em.getTransaction().begin();
        TypedQuery<Students> query = em.createQuery("select c from edu.mum.cs544.Students c", Students.class);
        List<Students> studentsList = query.getResultList();
        for (Students students : studentsList) {
            System.out.println("Name =  " + students.getName());
        }
       // em.getTransaction().commit();
        em.close();
    }

    public static void setTransaction(Integer id) {
        emf = Persistence.createEntityManagerFactory("simpsons");

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        // Create new instance of Car and set values in it
        Students stu = new Students(id, "Ashish", "apokhrel@miu.edu", "123456");
        em.persist(stu);
        em.getTransaction().commit();
        em.close();
    }
}
