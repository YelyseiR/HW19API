package com.example.db.controller;

import com.example.db.entity.Note;

public interface DBNoteController {

    Object getAllNotes();

    Object getNoteById(Long id);

    Object createNote(Note note);

    Object editNoteById(Long id, Note note);

    Object deleteNoteById(Long id);
}