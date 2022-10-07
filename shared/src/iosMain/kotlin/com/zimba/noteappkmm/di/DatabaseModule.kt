package com.zimba.noteappkmm.di

import com.zimba.noteappkmm.data.local.DatabaseDriverFactory
import com.zimba.noteappkmm.data.note.SqlDelightNoteDataSource
import com.zimba.noteappkmm.database.NoteDatabase
import com.zimba.noteappkmm.domain.note.NoteDataSource

class DatabaseModule {

    private val factory by lazy { DatabaseDriverFactory()}
    val noteDataSource: NoteDataSource by lazy{
        SqlDelightNoteDataSource(NoteDatabase(factory.createDriver()))
    }
}