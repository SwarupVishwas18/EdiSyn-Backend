package com.swarupvishwas.EdiSync.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.swarupvishwas.EdiSync.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
