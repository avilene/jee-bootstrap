package com.realdolmen.registration.repository;

import com.realdolmen.registration.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

@Stateless
@Named
public class UserRepository {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserRepository.class);

    @PersistenceContext
    private EntityManager entityManager;

    public User find(int id) {
        return entityManager.find(User.class, id);
    }

    public Collection<User> findAll() {
        LOGGER.info("Find all users");
        return entityManager.createQuery("select u from User u order by u.lastName", User.class).getResultList();
    }

    public User registerUser(User u){
        entityManager.persist(u);
        entityManager.flush();
        entityManager.clear();
        return u;
    }

    public void remove(User user) {
        entityManager.remove(entityManager.merge(user));
    }
}
