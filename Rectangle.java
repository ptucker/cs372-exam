public class Rectangle implements Shape{
    int ID;
    String color;
    int length;
    int width;

    public Rectangle(int id, String color, int length, int width) {
        this.ID = id;
        this.color = color;
        this.length = length;
        this.width = width;
    }

    @Override
    public int getID() {
        return ID;
    }

    @Override
    public String getKind() {
        return "Rectangle";
    }

    @Override
    public String getDetailString() {
        String str = "<html>" + toString() + "<br>" + "Color: " + getColor() + "<br>" + "Length: " + Integer.toString(length) + "<br>" + "width: " + Integer.toString(width) + "<br>" + "Area: " + Double.toString(getArea()) + "<br>" + "Perimeter: " + Double.toString( getPerimeter()) + "</html>";
        return str;
    }

    @Override
    public String toString() {
        return getKind() + " (ID# " + Integer.toString(getID()) + ")";
    }

    public double getArea() { 
        return (double)(length*width);
    }
    public double getPerimeter() {
        return (double)((2*length)*(2*width));
    }
    public String getColor() {
        return color;
    }
}