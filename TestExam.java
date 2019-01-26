/*
FEEDBACK

Read from the file correctly: 20/20%
Implement class hierarchy correctly: 20/20%
Populate appropriate data structures with shape data: 15/15%
Show list of shapes correctly: 10/15%
Show specific shape properties correctly: 12/15%
Well-structured, well-commented code: 8/15%


Comments:
  Shape doesn't need to implement toString, since that's on Object
  Need more useful comments
  ReadFromFile should be factored out into smaller functions
  Images missing
*/

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

        ShapeUI shapeUI = new ShapeUI();
    }
}
