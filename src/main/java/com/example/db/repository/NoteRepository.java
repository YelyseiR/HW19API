package com.example.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.db.entity.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
}