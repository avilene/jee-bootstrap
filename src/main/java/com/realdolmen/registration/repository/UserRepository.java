package com.realdolmen.registration.repository;

import com.realdolmen.registration.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

@Stateless
@Named
public class UserRepository {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @PersistenceContext
    private EntityManager entityManager;

    public User find(int id) {
        return entityManager.find(User.class, id);
    }

    public Collection<User> findAll() {
        logger.info("Find all users");
        return entityManager.createQuery("select u from User u order by u.lastName", User.class).getResultList();
    }

    public void remove(User user) {
        entityManager.remove(entityManager.merge(user));
    }
}
