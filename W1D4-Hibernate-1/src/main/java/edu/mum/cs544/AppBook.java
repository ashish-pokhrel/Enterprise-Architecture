package edu.mum.cs544;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.Date;
import java.util.List;

public class AppBook {
    private static EntityManagerFactory emf;

    public static void main(String[] args) {
        try {
            emf = Persistence.createEntityManagerFactory("cs544");

            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            // Create new instance of Car and set values in it
            Book b1 = new Book(1,"JAVA","46-45","ashish",500,new Date());
            // save the car
            em.persist(b1);
            // Create new instance of Car and set values in it
            Book b2 = new Book(2,"WAP","46-46","ashish",500,new Date());
            // save the car
            em.persist(b2);

            Book b3 = new Book(3,"MPP","46-47","ashish",500,new Date());
            em.persist(b3);

            em.getTransaction().commit();
            em.close();

            em = emf.createEntityManager();
            em.getTransaction().begin();

            // retieve all cars
            TypedQuery<Book> query = em.createQuery("Select c from Book c", Book.class);
            List<Book> bookList = query.getResultList();
            for (Book book : bookList) {
                System.out.println("Title= " + book.getTitle() + ", Author= "
                        + book.getAuthor() + ", price= " + book.getPrice());
            }
            em.getTransaction().commit();
            em.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
