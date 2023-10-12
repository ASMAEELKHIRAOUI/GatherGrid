package org.example.repository;

import org.example.domain.Event;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EventRepository {
    private final EntityManagerFactory entityManagerFactory;
    public EventRepository(){
        entityManagerFactory= Persistence.createEntityManagerFactory("my-persistence-unit");
    }

    public void save(Event event){
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(event);
        entityManager.getTransaction().commit();
        entityManager.close();
    }


}
