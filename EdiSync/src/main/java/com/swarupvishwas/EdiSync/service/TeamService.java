package com.swarupvishwas.EdiSync.service;

import com.swarupvishwas.EdiSync.model.Team;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public interface TeamService {
    public Team saveTeam(Team team);

    public Optional<Team> getTeam(int id);
}
