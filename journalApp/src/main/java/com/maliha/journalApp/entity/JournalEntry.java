package com.maliha.journalApp.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class JournalEntry {
    @Id
    private String id;
    private String title;
    private String content;
}
