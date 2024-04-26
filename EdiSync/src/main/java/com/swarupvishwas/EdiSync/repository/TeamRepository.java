package com.swarupvishwas.EdiSync.repository;

import com.swarupvishwas.EdiSync.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {

}
