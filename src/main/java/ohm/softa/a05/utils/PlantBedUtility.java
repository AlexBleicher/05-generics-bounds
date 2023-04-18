package ohm.softa.a05.utils;

import ohm.softa.a05.collections.SimpleList;
import ohm.softa.a05.model.Plant;
import ohm.softa.a05.model.PlantBed;
import ohm.softa.a05.model.PlantColor;

public abstract class PlantBedUtility {

    private PlantBedUtility() {
    }

    public static <R extends Plant> void repot(PlantBed<R> bedFrom, PlantBed<? super R> bedTo, PlantColor c) {
        SimpleList<R> plantsByColor = bedFrom.getPlantsByColor(c);
        for (R plant : plantsByColor) {
            bedTo.add(plant);
        }
        bedFrom.remove(plantsByColor);
    }

}
