package Shapes;

public class Square extends Rectangle {
    public Square(int side){
        super(side,side);
    }
public int getPerimeter(){
        return this.length*4;

    }
    public int getArea(){
    return this.length*this.length;
    }
}
