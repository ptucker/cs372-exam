import java.util.ArrayList;

public class TestExam {
    public static void main(String args[]) {
        ArrayList<Object> shapeArray = new ArrayList<Object>();

        Circle circle = new Circle(200, "yellow", 5);
        shapeArray.add(circle);
        Rectangle rect = new Rectangle(300, "blue", 12, 16);
        shapeArray.add(rect);
        Square square = new Square(400, "orange", 3);
        shapeArray.add(square);
        Triangle tri = new Triangle(500, "pink", 3, 4, 5);
        shapeArray.add(tri);

        ReadFromFile read = new ReadFromFile();
    }
}