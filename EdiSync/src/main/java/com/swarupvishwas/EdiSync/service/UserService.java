package com.swarupvishwas.EdiSync.service;

import com.swarupvishwas.EdiSync.model.User;

import java.util.Optional;

public interface UserService {
    public User saveUser(User user);
    public boolean checkCredentials(String email, String password);


    public Optional<User> getUser(int id);
    public String getRole(int id);
}
