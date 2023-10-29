package ru.geekbrains.lesson5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class EditorDatabase implements Database {

    private Random random = new Random();
    private final ProjectFile projectFile;
    private Collection<Entity> entities;

    public EditorDatabase(ProjectFile projectFile){
        this.projectFile = projectFile;
        load();
    }

    @Override
    public void load() {
        // Загрузка всех сущностей проекта (модели, текстуры)
        System.out.println("Компонент успешно загружен! ");
    }

    @Override
    public void save() {
        // Сохранение текущего состояния всех сущностей проекта
        System.out.println("Новый компонент успешно сохранён в базе данных!");
    }

    @Override
    public Collection<Entity> getAll() {
        // Ленивая загрузка
        if (entities == null){
            entities = new ArrayList<>();
            int modelsCount = 10 - random.nextInt(6); // 5 - 10
            for (int i = 0; i < modelsCount; i++)
                generateModelAndTextures();
        }

        return entities;
    }

    private void generateModelAndTextures(){
        Model3D model = new Model3D();
        int textureCount = random.nextInt(3);
        for (int i = 0; i < textureCount; i++){
            Texture texture = generateTexture();
            model.getTextures().add(texture);
            entities.add(texture);
        }
        entities.add(model);
    }

    private Texture generateTexture(){
        return new Texture();
    }

    public void addNewModel(Model3D model3D)
    {
        for(Entity entity: entities)
        {
            if(!model3D.equals(entity))
            {
                entities.add(model3D);
            }
            else
            {
                throw new RuntimeException("Данная модель не уникальна и уже присутствует в базе данных!");
            }
        }
    }
    public void addNewTexture(Texture texture)
    {
        for(Entity entity: entities)
        {
            if(!texture.equals(entity))
            {
                entities.add(texture);
            }
            else
            {
                throw new RuntimeException("Данная текстура не уникальна и уже присутствует в базе данных!");
            }
        }
    }

    @Override
    public Model3D createNewModel()
    {
        Model3D model3D = new Model3D();
        System.out.println("Новая 3DМодель создана!" + model3D);
        return model3D;
    }

    @Override
    public Texture createNewTexture() {
        Texture texture = new Texture();
        System.out.println("Новая текстура создана " + texture);
        return texture;
    }
}
