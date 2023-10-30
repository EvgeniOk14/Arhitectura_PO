package ru.geekbrains.lesson6.presentation.queries.controllers;

import ru.geekbrains.lesson6.application.interfaces.NoteEditor;
import ru.geekbrains.lesson6.domain.Note;
import ru.geekbrains.lesson6.presentation.queries.controllers.Controller;

public class NotesController extends Controller {

    private final NoteEditor noteEditor;

    public NotesController(NoteEditor noteEditor) {
        this.noteEditor = noteEditor;
    }

    //TODO: \notes\all
    public void routeGetAll(){
        noteEditor.printAll();
    }

    public void routeAddNote()
    {
        noteEditor.add(noteEditor.createNewNote());
    }

    public void removeNoteById(int id)
    {
        noteEditor.removeNoteById(id);
    }

}
