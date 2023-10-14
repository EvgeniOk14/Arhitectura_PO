package ru.geekbrains.lesson1.store3d.inmemorymodel;

import ru.geekbrains.lesson1.store3d.modelelements.Camera;
import ru.geekbrains.lesson1.store3d.modelelements.Flash;
import ru.geekbrains.lesson1.store3d.modelelements.PoligonalModel;
import ru.geekbrains.lesson1.store3d.modelelements.Scene;

import java.util.ArrayList;
import java.util.Collection;

public class ModelStore implements ModelChanger
{

    private Collection<PoligonalModel> models = new ArrayList<>();
    private Collection<Camera> cameras = new ArrayList<>();
    private Collection<Flash> flashes = new ArrayList<>();
    private Collection<Scene> scenes = new ArrayList<>();
    private Collection<ModelChangedObserver> changeObservers = new ArrayList<>();

    public ModelStore(Collection<PoligonalModel> models,
                      Collection<Camera> cameras,
                      Collection<Flash> flashes,
                      Collection<Scene> scenes,
                      Collection<ModelChangedObserver> changeObservers)
    {
        this.models = models;
        this.cameras = cameras;
        this.flashes = flashes;
        this.scenes = scenes;
        this.changeObservers = changeObservers;
    }
    public ModelStore(Collection<PoligonalModel> models,
                      Collection<Camera> cameras,
                      Collection<Flash> flashes,
                      Collection<Scene> scenes)
    {
        this(models, cameras, flashes, scenes,null);
    }
    public ModelStore(Collection<PoligonalModel> models,
                      Collection<Camera> cameras,
                      Collection<Flash> flashes)
    {
        this(models, cameras, flashes, null, null);
    }

    public Collection<PoligonalModel> getModels()
    {
        return models;
    }

    public void setModels(Collection<PoligonalModel> models)
    {
        this.models = models;
    }

    public Collection<Camera> getCameras()
    {
        return cameras;
    }

    public void setCameras(Collection<Camera> cameras)
    {
        this.cameras = cameras;
    }

    public Collection<Flash> getFlashes()
    {
        return flashes;
    }

    public void setFlashes(Collection<Flash> flashes)
    {
        this.flashes = flashes;
    }

    public Collection<Scene> getScenes()
    {
        return scenes;
    }

    public void setScenes(Collection<Scene> scenes)
    {
        this.scenes = scenes;
    }

    public Collection<ModelChangedObserver> getChangeObservers()
    {
        return changeObservers;
    }

    public void setChangeObservers(Collection<ModelChangedObserver> changeObservers)
    {
        this.changeObservers = changeObservers;
    }

    public ModelStore(Collection<PoligonalModel> models,
                      Collection<Camera> cameras)
    {
        this(models, cameras, null, null, null);
    }
    public ModelStore(Collection<PoligonalModel> models)
    {
        this(models, null, null, null, null);
    }
    public ModelStore()
    {
        this(null, null, null, null, null);
    }
    /**
     * Нотифицирует о событии
     */
    @Override
    public void notifyChange()
    {
        for (ModelChangedObserver observer : changeObservers)
        {
            observer.applyUpdateModel();
        }
    }

    @Override
    public void registerModelChanger(ModelChangedObserver o)
    {
        changeObservers.add(o);
    }

    @Override
    public void removeModelChanger(ModelChangedObserver o)
    {
        changeObservers.remove(o);
    }

}
