package com.swarupvishwas.EdiSync.repository;

import com.swarupvishwas.EdiSync.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Integer> {
    @Query("SELECT d FROM Document d WHERE d.projectId = ?1")
    public Document getDocumentById(int projectId);
}

