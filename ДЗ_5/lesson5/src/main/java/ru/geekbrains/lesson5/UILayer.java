package ru.geekbrains.lesson5;

public interface UILayer {

    void openProject(String fileName);
    void showProjectSettings();
    void saveProject();
    void printAllModels();
    void printAllTextures();
    void renderAll();
    void renderModel(int i);
    void addNewModel(Model3D model3D);
    void addNewTexture(Texture texture);
    Model3D createNewModel();
    Texture createNewTexture();

}
