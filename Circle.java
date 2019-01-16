import java.awt.Color;
import java.lang.Math;

public class Circle implements Shape {
    int ID;
    String color;
    int radius; 
    
    public Circle(int id, String color, int radius) {
        this.ID = id;
        this.color = color;
        this.radius = radius;
    }

    @Override
    public int getID() {
        return ID;
    }

    @Override
    public String getKind() {
        return "Circle";
    }

    @Override
    public String getDetailString() {
        String str = toString() + "\n" + "Color: " + getColor() + "\n" + "Radius: " + Integer.toString(radius) + "\n" + "Area: " + Double.toString(getArea()) + "\n" + "Perimeter: " + Double.toString( getPerimeter());
        return str;
    }

    @Override
    public String toString() {
        return getKind() + " (ID# " + Integer.toString(getID()) + ")";
    }

    public double getArea() {
       return Math.PI * (double)Math.pow(radius, 2);
    }
    public double getPerimeter() {
        return 2.0*Math.PI * (double)radius;
    }
    public String getColor() {
        return color;
    }
}