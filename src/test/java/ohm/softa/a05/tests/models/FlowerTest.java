package ohm.softa.a05.tests.models;

import ohm.softa.a05.model.Flower;
import ohm.softa.a05.model.PlantColor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {

    @Test
    void testFlowerNotGreen(){
        Flower f= new Flower(PlantColor.GREEN, 1, "Daffodil", "Test");
        assertNotEquals(f.getColor(), PlantColor.GREEN);
    }

    @Test
    void testCompareTo(){
        Flower f1 = new Flower(PlantColor.BLUE, 2.0, "Daffodil", "Test");
        Flower f2= new Flower(PlantColor.ORANGE, 3.1, "Dandilion", "Test2");
        int compared = f1.compareTo(f2);
        assert(compared<0);
    }

}