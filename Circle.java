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
        String str = "<html>" + toString() + "<br>" + "Color: " + getColor() + "<br>" + "Radius: " + Integer.toString(radius) + "<br>" + "Area: " + Double.toString(getArea()) + "<br>" + "Perimeter: " + Double.toString( getPerimeter()) +  "</html>";
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