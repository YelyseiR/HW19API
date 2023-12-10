package com.example.response.controller;

import com.example.db.controller.DBNoteController;
import com.example.db.entity.Note;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.response.service.NoteServiceWithDefaultResponseEntity;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/response/notes")
public class NoteControllerWithDefaultResponseEntity implements DBNoteController {

    private final NoteServiceWithDefaultResponseEntity service;

    @Override
    @GetMapping("/list")
    public ResponseEntity<List<Note>> getAllNotes() {
        return service.getAll();
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<Note> getNoteById(@PathVariable Long id) {
        return service.getById(id);
    }

    @Override
    @PostMapping("/add")
    public ResponseEntity<Note> createNote(@RequestBody Note note) {
        return service.create(note);
    }

    @Override
    @PutMapping("/edit/{id}")
    public ResponseEntity<Note> editNoteById(@PathVariable Long id, @RequestBody Note note) {
        return service.update(note);
    }

    @Override
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Note> deleteNoteById(@PathVariable Long id) {
        return service.deleteById(id);
    }
}