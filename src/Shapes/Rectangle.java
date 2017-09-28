package Shapes;

public class Rectangle {
    protected double length;
    protected double width;
        //constructor for length and width
    public Rectangle (double length, double width){
        this.length = length;
        this.width = width;
    }
    // Method for area
    public double getArea(){
        return length * width;
    }
    // Method for perimeter
    public double getPerimeter(){
       return (2 * length) + (2 * width);
    }

    }

