package com.example.notes.persistance;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.notes.models.Note;

import java.util.List;

@Dao
public interface NoteDao {
    @Insert
    long[] insertNotes(Note[] notes);

    @Query("SELECT * FROM notes")
    LiveData<List<Note>> getNotes();

//    @Query("SELECT * FROM notes WHERE title LIKE :title")
//    LiveData<List<Note>> getNotesSample(String title);
    @Delete
    int delete(Note[] notes);

    @Update
    int update(Note[] notes);

}
