package ohm.softa.a05.utils;

import ohm.softa.a05.model.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlantBedUtilityTest {

    @BeforeAll
    void init(){
        PlantBed<Flower> flowerBed= new PlantBed<>();
        flowerBed.add(new Flower(PlantColor.BLUE, 2.0, "Daffodil", "Test"));
        flowerBed.add(new Flower(PlantColor.ORANGE, 4.0, "Tulip", "Test"));
        PlantBed<Plant> plantBed = new PlantBed<>();
        plantBed.add(new Shrub( 5.0, "Dave", "Test"));
        plantBed.add(new Flower(PlantColor.BLUE, 1.0, "Tulip", "Test"));
    }
    @Test
    void repot(){

    }
}