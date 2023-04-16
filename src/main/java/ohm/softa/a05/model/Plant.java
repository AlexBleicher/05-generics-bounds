package ohm.softa.a05.model;

import java.util.Objects;

public abstract class Plant implements Comparable<Plant> {
    double height;
    String family;
    String name;
    public double getHeight(){
        return height;
    }

    public Plant(double height, String family, String name) {
        this.height = height;
        this.family = family;
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public abstract PlantColor getColor();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plant plant = (Plant) o;
        return Double.compare(plant.height, height) == 0 && Objects.equals(family, plant.family) && Objects.equals(name, plant.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, family, name);
    }
}
