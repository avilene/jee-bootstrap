package com.realdolmen.registration.domain;

import com.realdolmen.registration.repository.UserRepository;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class RegistrationBean {

    @Inject
    UserRepository userRepository;

    User user = new User();
    public RegistrationBean() {
    }

    public User getUser() {
        return user;
    }

    public String registerUser(){
        if(userRepository.registerUser(user).getId() != null) {
            return "users?faces-redirect=true";
        }else{
            return null;
        }
    }


}
