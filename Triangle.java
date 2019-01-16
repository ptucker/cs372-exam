import java.lang.Math;

public class Triangle implements Shape{
    int ID;
    String color;
    int side1;
    int side2;
    int side3;

    public Triangle(int id, String color, int side1, int side2, int side3) {
        this.ID = id;
        this.color = color;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public int getID() {
        return ID;
    }

    @Override
    public String getKind() {
        return "Triangle";
    }

    @Override
    public String getDetailString() {
        String str = toString() + "\n" + "Color: " + getColor() + "\n" + "Side1: " + Integer.toString(side1) + "\n" + "Side2: " + Integer.toString(side2) + "\n" + "Side3: " + Integer.toString(side3) + "\n"+ "Area: " + Double.toString(getArea()) + "\n" + "Perimeter: " + Double.toString( getPerimeter());
        return str;
    }

    @Override
    public String toString() {
        return getKind() + " (ID# " + Integer.toString(getID()) + ")";
    }

    public double getArea() {
        double p = getPerimeter()/2;
        double area = Math.sqrt(p*(p-(double)side1)*(p-(double)side2)*(p-(double)side3));
        return area;
    }
    public double getPerimeter() {
        return (double)(side1 + side2 + side3);
    }
    public String getColor() {
        return color;
    }

}