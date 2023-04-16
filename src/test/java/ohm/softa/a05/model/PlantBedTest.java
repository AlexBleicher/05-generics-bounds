package ohm.softa.a05.model;

import ohm.softa.a05.collections.SimpleList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlantBedTest {

    private final Logger logger = LogManager.getLogger();
    PlantBed<Plant> testPlantBed = new PlantBed<>();

    @BeforeEach
    void setup(){

        testPlantBed.add(new Flower(PlantColor.ORANGE, 2.3, "A", "A"));
        testPlantBed.add(new Flower(PlantColor.BLUE, 6.9, "B", "B"));
        testPlantBed.add(new Flower(PlantColor.ORANGE, 4.20, "C", "C"));
        testPlantBed.add(new Flower(PlantColor.GREEN, 1.09, "D", "E"));
        testPlantBed.add(new Shrub(2.0, "E", "E"));

    }

    @Test
    void add() {
        logger.info("Testing if adding and iterating elements is implemented correctly");
        int counter = 0;
        for(Plant o : testPlantBed.plants){
            counter++;
        }
        assertEquals(5, counter);
    }

    @Test
    void size() {
        logger.info("Testing if size() method is implemented correctly");
        assertEquals(5, testPlantBed.size());
    }

    @Test
    void getPlantsByColor() {
        logger.info("Testing if getting Sublist of specific PlantColor is implemented Correctly");
        SimpleList<Plant> subList = testPlantBed.getPlantsByColor(PlantColor.ORANGE);
        for (Plant plant : subList) {
            assert(plant.getColor()==PlantColor.ORANGE);
        }
    }
}