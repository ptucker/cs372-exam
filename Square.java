public class Square implements Shape {
    int ID;
    String color;
    int width;

    public Square(int id, String color, int width) {
        this.ID = id;
        this.color = color;
        this.width = width;
    }

    @Override
    public int getID() {
        return ID;
    }

    @Override
    public String getKind() {
        return "Square";
    }

    @Override
    public String getDetailString() {
        String str = toString() + "\n" + "Color: " + getColor() + "\n"  + "width: " + Integer.toString(width) + "\n" + "Area: " + Double.toString(getArea()) + "\n" + "Perimeter: " + Double.toString( getPerimeter());
        return str;
    }

    @Override
    public String toString() {
        return getKind() + " (ID# " + Integer.toString(getID()) + ")";
    }

    public double getArea() { 
        return (double)(width*width);
    }
    public double getPerimeter() {
        return (double)(4*width);
    }
    public String getColor() {
        return color;
    }
}