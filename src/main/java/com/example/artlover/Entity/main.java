package com.example.artlover.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class main {
  private static Object artist1;

  public static void main(String[] args) {
    artist1 = new artist1();
    artist1.equals("Grayson");
    artist1.equals("Perry");
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    entityManager.getTransaction().begin();
    entityManager.persist(artist1);
    entityManager.getTransaction().commit();
    entityManager.close();
    entityManagerFactory.close();
  }
}



