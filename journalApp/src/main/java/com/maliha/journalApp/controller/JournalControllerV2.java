package com.maliha.journalApp.controller;

import com.maliha.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalControllerV2 {
    private Map<String, JournalEntry> journalEntity= new HashMap<>();
    @GetMapping
    public Map<String, JournalEntry> getAllJournalEntity() {
        return journalEntity;
    }
    @PostMapping
    public Boolean createJournalEntity(@RequestBody JournalEntry journalEntity) {
        this.journalEntity.put(journalEntity.getId(), journalEntity);
        return true;
    }
    @GetMapping("/{id}")
    public JournalEntry getJournalEntityById(@PathVariable String id) {
        return journalEntity.get(id);
    }
    @PutMapping("/{id}")
    public Boolean updateJournalEntity(@PathVariable String id, @RequestBody JournalEntry journalEntity) {
        if (this.journalEntity.containsKey(id)) {
            this.journalEntity.put(id, journalEntity);
            return true;
        }
        return false;
    }
    @DeleteMapping("/{id}")
    public Boolean deleteJournalEntity(@PathVariable String id) {
        if (this.journalEntity.containsKey(id)) {
            this.journalEntity.remove(id);
            return true;
        }
        return false;
    }
}
