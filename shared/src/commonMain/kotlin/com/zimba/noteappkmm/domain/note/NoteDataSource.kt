package com.zimba.noteappkmm.domain.note

import com.zimba.noteappkmm.domain.note.Note

interface NoteDataSource {
    suspend fun insertNote(note: Note)
    suspend fun getNoteById(id: Long): Note?
    suspend fun getAllNotes():List<Note>
    suspend fun deleteNoteById(id: Long)
}