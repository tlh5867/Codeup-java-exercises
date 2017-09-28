package Shapes;

public class ShapeTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4,5){
        };
        System.out.println("The perimeter of box1 is: " + box1.getPerimeter());
        System.out.println("The area of box 1 is: " + box1.getArea());

        Rectangle box2 = new Square(8){};
        System.out.println("The perimeter of box 2 is:" + box2.getPerimeter());
        System.out.println("The area of box 2 is:" + box2.getArea());

    }


    }


