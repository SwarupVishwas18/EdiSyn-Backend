package com.swarupvishwas.EdiSync.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.swarupvishwas.EdiSync.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("SELECT u FROM User u WHERE u.email = ?1 and u.password = ?2")
    public User findByEmail(String email, String password);

    @Query("SELECT u.role FROM User u WHERE u.id = ?1")
    public String getRole(int id);
}
