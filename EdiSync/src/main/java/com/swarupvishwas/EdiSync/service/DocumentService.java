package com.swarupvishwas.EdiSync.service;

import com.swarupvishwas.EdiSync.model.Document;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface DocumentService {
    public Document saveDocument(Document document);

    public Optional<Document> getDocumentById(int id);

    public List<Document> getDocumentsByProject(int projectId);
}
