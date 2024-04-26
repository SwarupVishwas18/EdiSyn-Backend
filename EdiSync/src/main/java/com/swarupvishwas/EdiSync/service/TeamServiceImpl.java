package com.swarupvishwas.EdiSync.service;

import com.swarupvishwas.EdiSync.model.Team;
import com.swarupvishwas.EdiSync.repository.TeamRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;


public class TeamServiceImpl implements TeamService {
   TeamRepository teamRepo;
    @Override
    public Team saveTeam(Team team) {
        return teamRepo.save(team);
    }

    @Override
    public void addTeamMember(int member1Id,int member2Id, int member3Id, int member4Id ,int teamId) {
        teamRepo.addMembers(member1Id, member2Id, member3Id, member4Id, teamId);
    }

    @Override
    public Optional<Team> getTeam(int id) {
        return teamRepo.findById(id);
    }
}
