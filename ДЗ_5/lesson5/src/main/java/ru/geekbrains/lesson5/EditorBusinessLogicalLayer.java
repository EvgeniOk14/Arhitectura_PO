package ru.geekbrains.lesson5;

import java.util.Collection;
import java.util.Random;

public class EditorBusinessLogicalLayer implements BusinessLogicalLayer {

    private DatabaseAccess editorDatabaseAccess;

    public EditorBusinessLogicalLayer(DatabaseAccess editorDatabaseAccess){
        this.editorDatabaseAccess = editorDatabaseAccess;
    }



    @Override
    public Collection<Model3D> getAllModels() {
        return editorDatabaseAccess.getAllModels();
    }

    @Override
    public Collection<Texture> getAllTextures() {
        return editorDatabaseAccess.getAllTextures();
    }

    @Override
    public void renderModel(Model3D model) {
        processRender(model);
    }

    @Override
    public void renderAllModels() {
        for (Model3D model: getAllModels()) {
            processRender(model);
        }
    }

    @Override
    public void addNewModel(Model3D model3D) {
        editorDatabaseAccess.addNewModel(model3D);
    }

    @Override
    public void addNewTexture(Texture texture) {
        editorDatabaseAccess.addNewTexture(texture);
    }

    @Override
    public Model3D createNewModel()
    {
        return editorDatabaseAccess.createNewModel();
    }

    @Override
    public Texture createNewTexture()
    {
        return editorDatabaseAccess.createNewTexture();
    }

    private Random random = new Random();

    private void processRender(Model3D model){
        try {
            Thread.sleep(2500 - random.nextInt(2000));
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
