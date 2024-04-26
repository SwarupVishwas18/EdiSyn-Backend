package com.swarupvishwas.EdiSync.service;

import com.swarupvishwas.EdiSync.model.User;

public interface UserService {
    public User saveUser(User user);
    public boolean checkCredentials(User user);
    public User getUser(int id);
    public String getRole(User user);
}
