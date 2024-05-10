package com.swarupvishwas.EdiSync.service;

import com.swarupvishwas.EdiSync.model.User;
import com.swarupvishwas.EdiSync.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;

import java.util.Optional;


public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepo;

    @Override
    public User saveUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public boolean checkCredentials(String email, String password) {
        User user = userRepo.findByEmailAndPass(email, password);
        return user != null;
    }

    @Override
    public Optional<User> getUser(int id) {
        return userRepo.findById(id);
    }

    @Override
    public String getRole(int id) {
        return userRepo.getRole(id);
    }
}
