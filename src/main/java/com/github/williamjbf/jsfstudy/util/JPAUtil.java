package com.github.williamjbf.jsfstudy.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

    private static EntityManagerFactory factory;

    static {
        factory = Persistence.createEntityManagerFactory("jsf-db");
    }

    public static EntityManager getEntityManager() {
        return factory.createEntityManager();
    }

}
