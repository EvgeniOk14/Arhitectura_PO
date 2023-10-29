package ru.geekbrains.lesson5;

import java.util.Collection;

/**
 * Интерфейс Data Access Layer
 */
public interface DatabaseAccess {

    void addEntity(Entity entity);
    void removeEntity(Entity entity);
    Collection<Texture> getAllTextures();
    Collection<Model3D> getAllModels();
    void addNewModel(Model3D model3D);
    void addNewTexture(Texture texture);
    Model3D createNewModel();
    Texture createNewTexture();

}
