package Shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape = new Square(5);
        //showshapeinfo calls the method to print out the perimeter and area
        showShapeInfo(myShape);
        myShape = new Rectangle(12, 8);
        // showshapeinfo calls the method to print out the perimeter and area
        showShapeInfo(myShape);
    }
        //This prints out the results from the info given for Square and Rectangle
    public static void showShapeInfo(Measurable shape) {
        System.out.println(shape.getPerimeter());
        System.out.println(shape.getArea());


    }
}









