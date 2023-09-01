package com.example.serviceauthorization.repository;

import com.example.serviceauthorization.method.Authorities;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class UserRepository {

    @Value("${user.login}")
    private String login;
    @Value("${user.password}")
    private String password;
    //private final Map<String, String> usersList = new HashMap<>();

    public UserRepository() {
    }

    public List<Authorities> getUserAuthorities(String user, String password) {
//        if (!usersList.containsKey(user) || !usersList.get(user).equals(password)) {
//            return null;
//        }
        if (!user.equals(login) || !password.equals(this.password)) {
            return new ArrayList<>();
        }
        return new ArrayList<>(List.of(Authorities.READ));
    }
}