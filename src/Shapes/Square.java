package Shapes;

public class Square extends Quadrilateral {
    public Square (double side) {
        super (side,side);
    }

    @Override
    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }
        // The width is not really needed but its good to have it for reference.
    @Override
    public void setWidth(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
