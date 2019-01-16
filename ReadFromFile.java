import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class ReadFromFile {
    ArrayList<Object> shapesArray = new ArrayList<Object>();

    public ReadFromFile() {
        //String curdir = System.get
        try {
            File file = new File("shapes.txt");
        
            BufferedReader br = new BufferedReader(new FileReader(file));

            String str;
            while((str = br.readLine())!= null) {
                for(int i = 0; i < str.length(); i++) {
                    if(str.charAt(i)==':') {

                        //for circle class creation
                        if(str.substring(0, i).equals("circle")) {
                            int id = 0;
                            int radius = 0;
                            String color = "";
                            int whiteSpacePlace = 0;
                            
                            for(int x = i+1; x<str.length(); x++) {
                                if(Character.isWhitespace(str.charAt(x)) && whiteSpacePlace==0) {
                                    if(Character.isWhitespace(str.charAt(x+2))) {
                                        char c = str.charAt(x+1);
                                        id = Integer.parseInt(Character.toString(c));
                                    } else {
                                        String s = str.substring(x+1,x+3);
                                        id = Integer.parseInt(s);
                                    }
                                    whiteSpacePlace=x;
                                } else if(Character.isWhitespace(str.charAt(x)) && whiteSpacePlace>0) {
                                    char c = str.charAt(x-1);
                                    radius = Integer.parseInt(Character.toString(c));
                                    color = str.substring(x+1,str.length());
                                }
                                
                            }
                            Circle circle = new Circle(id, color, radius);
                            shapesArray.add(circle);

                        //for rectangle class creatation
                        } else if( str.substring(0,i).equals("rectangle")) {
                            int id = 0;
                            int length = 0;
                            int width = 0;
                            String color = "";
                            int whiteSpacePlace = 0;

                            for(int x= i+1; x<str.length(); x++) {

                                if(Character.isWhitespace(str.charAt(x)) && whiteSpacePlace==0){
                                    String s = str.substring(x+1,x+4);
                                    id = Integer.parseInt(s);
                                    whiteSpacePlace = x;
                                } else if(Character.isWhitespace(str.charAt(x)) && whiteSpacePlace>0) {
                                    char c = str.charAt(x+1);
                                    length = Integer.parseInt(Character.toString(c));
                                    c = str.charAt(x+3);

                                    width = Integer.parseInt(Character.toString(c));
                                    color = str.substring(x+5, str.length());
                                    whiteSpacePlace = x;
                                    break;
                                }
                                
                            }
                            Rectangle rectangle = new Rectangle(id, color, length, width);
                            shapesArray.add(rectangle);

                        //for square class creation
                        } else if(str.substring(0,i).equals("square")) {
                            int id = 0;
                            int width = 0;
                            String color = "";

                            for(int x = i+1 ; i<str.length(); i++) {
                                if(Character.isWhitespace(str.charAt(x))) {
                                    String s = str.substring(x+1,x+4);
                                    id = Integer.parseInt(s);

                                    char c = str.charAt(x+5);
                                    width = Integer.parseInt(Character.toString(c));
                                    color = str.substring(x+7,str.length());

                                    break;
    
                                }
                            } 
                            Square square = new Square(id, color, width);
                            shapesArray.add(square);

                        //for triangle class creation
                        } else if (str.substring(0,i).equals("triangle")) {
                            int id = 0;
                            int side1 = 0;
                            int side2 = 0;
                            int side3 = 0;
                            String color = "";
                            for(int x= i+1; x<str.length(); x++) {
                                if(Character.isWhitespace(str.charAt(x))) {
                                    String s = str.substring(x+1,x+4);
                                    id = Integer.parseInt(s);

                                    char c = str.charAt(x+5);
                                    side1 = Integer.parseInt(Character.toString(c));
                                    c = str.charAt(x+7);
                                    side2 = Integer.parseInt(Character.toString(c));
                                    c = str.charAt(x+9);
                                    side3 = Integer.parseInt(Character.toString(c));

                                    color = str.substring(x+11, str.length());
                                    break;
                                }
                            }
                            Triangle triangle = new Triangle(id, color, side1, side2, side3);
                            shapesArray.add(triangle);

                        } else {
                            System.out.println("object doesn't exist");
                        }
                    }
                }
            }
        } catch(Exception e) {
            System.out.println("this failed " + e.getMessage() + " " + e.getCause());
        }
    }
    /*
    public ArrayList getArrayList() {

    }
    */

}