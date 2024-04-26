package com.swarupvishwas.EdiSync.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.*;

@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    int leaderId;
   int member1Id;
    int member2Id;
    int member3Id;
    int member4Id;
    int guideId;

    public int getMember1Id() {
        return member1Id;
    }

    public void setMember1Id(int member1Id) {
        this.member1Id = member1Id;
    }

    public int getMember2Id() {
        return member2Id;
    }

    public void setMember2Id(int member2Id) {
        this.member2Id = member2Id;
    }

    public int getMember3Id() {
        return member3Id;
    }

    public void setMember3Id(int member3Id) {
        this.member3Id = member3Id;
    }

    public int getMember4Id() {
        return member4Id;
    }

    public void setMember4Id(int member4Id) {
        this.member4Id = member4Id;
    }

    public Team() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(int leaderId) {
        this.leaderId = leaderId;
    }



    public int getGuideId() {
        return guideId;
    }

    public void setGuideId(int guideId) {
        this.guideId = guideId;
    }
}

