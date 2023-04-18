package ohm.softa.a05.model;

import ohm.softa.a05.collections.SimpleFilter;
import ohm.softa.a05.collections.SimpleList;
import ohm.softa.a05.collections.SimpleListImpl;
import ohm.softa.a05.utils.PlantBedUtility;

import java.util.LinkedList;

public class PlantBed<T extends Plant> {

    SimpleList<T> plants = new SimpleListImpl<>();

    public void add(T plant) {
        plants.add(plant);
    }

    public int size() {
        return plants.size();
    }

    public SimpleList<T> getPlantsByColor(PlantColor color) {
        return plants.filter(new SimpleFilter<T>() {
            @Override
            public boolean include(T item) {
                return item.getColor() == color;
            }
        });
    }

    public void remove(SimpleList<T> plantsToRemove){
        for (T t : plantsToRemove) {
            plants.remove(t);
        }
    }
}
