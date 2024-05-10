package com.swarupvishwas.EdiSync.repository;

import com.swarupvishwas.EdiSync.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {
    @Query("SELECT t FROM Team t WHERE t.leaderId=?1 or t.member2Id=?1 or t.member3Id=?1 or t.member4Id=?1 or t.guideId=?1")
    public Team getTeamByMember(int id);
}
