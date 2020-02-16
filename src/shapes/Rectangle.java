package shapes;

public class Rectangle {
    protected int length;
    protected int width;


    public Rectangle(int length, int width) { //constructor
        this.length = length;
        this.width = width;
    }


    public int getArea() {
//        area = length x width
        return length * width;
    }

    public int getPerimeter() {
//        perimeter = 2 x length + 2 x width
        return (length + width) * 2;
    }
}
