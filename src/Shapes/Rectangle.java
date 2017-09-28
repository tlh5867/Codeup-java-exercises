package Shapes;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle (int length, int width){
        this.length = length;
        this.width = width;
    }
    public int getAreaOfRectangle(){
        return length * width;
    }
    public int getPerimeterOfRectangle(){
       return (2 * length) + (2 * width);
    }

    }

