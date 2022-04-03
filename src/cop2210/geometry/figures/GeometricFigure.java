package cop2210.geometry.figures;

import java.util.List;

public abstract class GeometricFigure {

    private String name;

    private String color;

    public GeometricFigure (String name, String color){

        this.name = name;
        setColor(color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        List<String> validColors = List.of("red" , "blue", "yellow", "green", "black" );
        if(validColors.contains(color.toLowerCase()))
            this.color = color;
        else
            this.color = "black";
    }

    public abstract double area();
    public abstract double perimeter();
}

