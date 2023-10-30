package ru.geekbrains.lesson6.application;

import ru.geekbrains.lesson6.application.interfaces.NoteEditor;
import ru.geekbrains.lesson6.application.interfaces.NotesDatabaseContext;
import ru.geekbrains.lesson6.application.interfaces.NotesPresenter;
import ru.geekbrains.lesson6.database.NotesRecord;
import ru.geekbrains.lesson6.domain.Note;

import java.util.Collection;
import java.util.Optional;


public class ConcreteNoteEditor implements NoteEditor {

    private final NotesDatabaseContext dbContext;
    private final NotesPresenter presenter;

    public ConcreteNoteEditor(
            NotesPresenter presenter,
            NotesDatabaseContext dbContext) {
        this.dbContext = dbContext;
        this.presenter = presenter;
    }

    @Override
    public Note createNewNote() {
         Note newNote = new Note(100, "newTitlle", "NewDetails");
        return newNote;
    }

    @Override
    public boolean add(Note item) {
        dbContext.getAll().add(item);
        System.out.println("Заметка " + item + " успешно добавлена в базу данных! ");
        return dbContext.saveChanges();
    }


    @Override
    public boolean removeNoteById(int id) {
        try
        {
            NotesRecord removeNote = dbContext.getById(id);
            remove(dbContext.getById(id));
            System.out.println("Заметка с номером " + id + " успешно удалена! ");
        }
        catch (RuntimeException e)
        {
            System.out.println(e.getMessage());
        }

        return true;
    }

    @Override
    public boolean edit(Note item) {
        return false;
    }


    @Override
    public boolean remove(Note item) {
        dbContext.getAll().remove(item);
        System.out.println("Заметка " + item + " успешно удалена из базы данных! ");
        return dbContext.saveChanges();
    }

    @Override
    public Optional<Note> getById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public Collection<Note> getAll() {
        return dbContext.getAll();
    }

    @Override
    public boolean remove(NotesRecord item) {
        return false;
    }

    @Override
    public void printAll() {
        presenter.printAll(getAll());
    }


}
