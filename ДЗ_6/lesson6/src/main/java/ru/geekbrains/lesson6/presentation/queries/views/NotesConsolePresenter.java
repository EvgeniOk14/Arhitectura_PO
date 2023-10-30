package ru.geekbrains.lesson6.presentation.queries.views;

import ru.geekbrains.lesson6.application.interfaces.NoteEditor;
import ru.geekbrains.lesson6.application.interfaces.NotesPresenter;
import ru.geekbrains.lesson6.domain.Note;

import java.util.Collection;
import java.util.Scanner;

public class NotesConsolePresenter implements NotesPresenter {
    @Override
    public void printAll(Collection<Note> notes) {
        for (Note note : notes){
            System.out.println(note);
        }
    }


    public int dialog()
    {
        System.out.println("Введите номер id удаляемой заметки: ");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        return id;
    }


}
