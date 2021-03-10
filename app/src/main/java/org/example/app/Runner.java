package org.example.app;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;

public class Runner {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        EntityManager entityManager = sessionFactory.createEntityManager();
        entityManager.close();
    }
}
