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
        String str = "<html>"+toString() + "<br>" + "Color: " + getColor() + "<br>"  + "width: " + Integer.toString(width) + "<br>" + "Area: " + Double.toString(getArea()) + "<br>" + "Perimeter: " + Double.toString( getPerimeter()) + "</html>";
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