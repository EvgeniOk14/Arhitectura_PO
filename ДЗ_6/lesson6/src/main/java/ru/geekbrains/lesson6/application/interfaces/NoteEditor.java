package ru.geekbrains.lesson6.application.interfaces;

import ru.geekbrains.lesson6.database.NotesRecord;
import ru.geekbrains.lesson6.domain.Note;


public interface NoteEditor extends Editor<Note, Integer>{

    boolean remove(NotesRecord item);

    void printAll();
    Note createNewNote();
    public boolean removeNoteById(int id);

}
