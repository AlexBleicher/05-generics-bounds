package ohm.softa.a05.model;

public class Flower extends Plant{

    private PlantColor color;

    public Flower(PlantColor color, double height, String family, String name) {
        super(height, family, name);
        if(color!=PlantColor.GREEN) {
            this.color = color;
        }
        else{
            this.color=PlantColor.BLUE;
        }
    }

    @Override
    public PlantColor getColor() {
        return color;
    }

    @Override
    public int compareTo(Plant o) {
        return Double.compare(this.height, o.getHeight());
    }
}
