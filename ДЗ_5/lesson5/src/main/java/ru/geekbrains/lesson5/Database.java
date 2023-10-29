package ru.geekbrains.lesson5;

import java.util.Collection;

/**
 * Интерфейс БД
 */
public interface Database {

    void load();
    void save();
    void addNewModel(Model3D model3D);
    void addNewTexture(Texture texture);
    Model3D createNewModel();
    Texture createNewTexture();

    Collection<Entity> getAll();

}
