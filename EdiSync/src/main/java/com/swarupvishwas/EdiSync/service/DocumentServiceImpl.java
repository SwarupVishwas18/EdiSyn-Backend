package com.swarupvishwas.EdiSync.service;

import com.swarupvishwas.EdiSync.model.Document;
import com.swarupvishwas.EdiSync.repository.DocumentRepository;

import java.util.Optional;

public class DocumentServiceImpl implements DocumentService {

    DocumentRepository docRepo;

    @Override
    public Document saveDocument(Document document) {
        return docRepo.save(document);
    }

    @Override
    public Optional<Document> getDocumentById(int id) {
        return docRepo.findById(id);
    }

    @Override
    public Document getDocumentsByProject(int projectId) {
        return docRepo.getDocumentById(projectId);
    }
}
