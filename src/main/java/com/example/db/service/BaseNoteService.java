package com.example.db.service;

import com.example.db.entity.Note;

public interface BaseNoteService {

    Object getAll();

    Object getById(Long id);

    Object create(Note note);

    Object update(Note note);

    Object deleteById(Long id);
}