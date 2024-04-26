package com.swarupvishwas.EdiSync.service;

import com.swarupvishwas.EdiSync.model.Team;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public interface TeamService {
    public Team saveTeam(Team team);
    public void addTeamMember(int member1Id, int member2Id, int member3Id, int member4Id, int teamId);
    public Optional<Team> getTeam(int id);
}
