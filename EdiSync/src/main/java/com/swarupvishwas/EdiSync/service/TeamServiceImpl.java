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
    public Optional<Team> getTeam(int id) {
        return teamRepo.findById(id);
    }
}
