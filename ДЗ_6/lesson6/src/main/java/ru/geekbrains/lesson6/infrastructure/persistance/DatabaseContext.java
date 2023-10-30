package ru.geekbrains.lesson6.infrastructure.persistance;

import ru.geekbrains.lesson6.application.interfaces.NotesDatabaseContext;
import ru.geekbrains.lesson6.database.NotesDatabase;
import ru.geekbrains.lesson6.database.NotesRecord;
import ru.geekbrains.lesson6.domain.Note;
import ru.geekbrains.lesson6.infrastructure.persistance.entityconfiguration.NoteConfiguration;

import java.util.ArrayList;
import java.util.Collection;

public class DatabaseContext extends DbContext implements NotesDatabaseContext {

    public Collection<Note> getAll(){
        Collection<Note> notes = new ArrayList<>();
        for (NotesRecord record : ((NotesDatabase)database).getNotesTable().getRecords()){
            notes.add(new Note(
                    record.getId(),
                    record.getTitle(),
                    record.getDetails()
            ));
        }
        return notes;
    }
    @Override
    public  NotesRecord getById(int id)
    {
        for(NotesRecord record : ((NotesDatabase)database).getNotesTable().getRecords())
        {
            if(record.getId() == id)
            {
                return record;
            }
            else
            {
                throw new RuntimeException("С таким номером id в базе данных нет заметок!");
            }
        }
        return null;
    }


    public DatabaseContext(Database database) {
        super(database);
    }

    @Override
    protected void onModelCreating(ModelBuilder builder) {
        builder.applyConfiguration(new NoteConfiguration());
    }
}
