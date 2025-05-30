package com.maliha.journalApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalRepository extends MongoRepository<JournalRepository, String> {
    // This interface will automatically provide CRUD operations for JournalEntry entities
    // You can add custom query methods here if needed
}
