package com.plcoding.cleanarchitecturenoteapp.feature_note.data.data_source

import androidx.room.Database
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.model.Note

@Database(
    entities = [Note::class],
    version = 1
)

abstract class NoteDatabase {

    abstract val noteDao : NoteDao


    companion object{
        const val NOTE_DATABASE_NAME = "DB_NAME"
    }
}