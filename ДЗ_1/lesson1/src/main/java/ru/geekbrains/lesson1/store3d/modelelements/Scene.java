package ru.geekbrains.lesson1.store3d.modelelements;

import java.util.Collection;

public class Scene
{
    private int id;
    private static int counter = 0;
    private Collection<PoligonalModel> models;
    private Collection<Flash> flashes;
    private Collection<Camera> cameras;

    public Scene(Collection<PoligonalModel> models, Collection<Flash> flashes, Collection<Camera> cameras)
    {
        this.models = models;
        this.flashes = flashes;
        this.cameras = cameras;
    }
    public Scene(Collection<PoligonalModel> models, Collection<Flash> flashes)
    {
        this(models, flashes, null);
    }
    public Scene(Collection<PoligonalModel> models)
    {
        this(models, null, null);
    }
    public Scene()
    {
        this(null, null, null);
    }


    public Collection<PoligonalModel> getModels()
    {
        return models;
    }

    public void setModels(Collection<PoligonalModel> models)
    {
        this.models = models;
    }

    public Collection<Flash> getFlashes()
    {
        return flashes;
    }

    public void setFlashes(Collection<Flash> flashes)
    {
        this.flashes = flashes;
    }

    public Collection<Camera> getCameras()
    {
        return cameras;
    }

    public void setCameras(Collection<Camera> cameras)
    {
        this.cameras = cameras;
    }
    {
        id=++counter;
    }
}
