package com.maliha.journalApp.controller;

import com.maliha.journalApp.entity.JournalEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalControllerV2 {
    private Map<Long, JournalEntity> journalEntity= new HashMap<>();
    @GetMapping
    public Map<Long, JournalEntity> getAllJournalEntity() {
        return journalEntity;
    }
    @PostMapping
    public Boolean createJournalEntity(@RequestBody JournalEntity journalEntity) {
        this.journalEntity.put(journalEntity.getId(), journalEntity);
        return true;
    }
    @GetMapping("/{id}")
    public JournalEntity getJournalEntityById(@PathVariable Long id) {
        return journalEntity.get(id);
    }
    @PutMapping("/{id}")
    public Boolean updateJournalEntity(@PathVariable Long id, @RequestBody JournalEntity journalEntity) {
        if (this.journalEntity.containsKey(id)) {
            this.journalEntity.put(id, journalEntity);
            return true;
        }
        return false;
    }
    @DeleteMapping("/{id}")
    public Boolean deleteJournalEntity(@PathVariable Long id) {
        if (this.journalEntity.containsKey(id)) {
            this.journalEntity.remove(id);
            return true;
        }
        return false;
    }
}
