package com.swarupvishwas.EdiSync.repository;

import com.swarupvishwas.EdiSync.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {
    @Query("UPDATE Team SET member1Id = ?1, member2Id = ?2, member3Id = ?3, member4Id = ?4 WHERE teamId = ?5")
    public void addMembers(int member1, int member2, int member3, int member4, int teamId);
}
