package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public int getLength() {
        return this.length;
    }

    @Override
    public int getWidth() {
        return this.width;
    }

    @Override
    public void setLength() {
        this.length = length;
    }

    @Override
    public void setWidth() {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return length * 4;
    }

    @Override
    public double getArea() {
        return length * width;
    }
    /*---FIRST RECTANGLE EXERCISE -HAD TO COMMENT OUT FOR SECOND EXERCISE---*/
//    protected int length;
//    protected int width;
//
//
//    public Rectangle(int length, int width) { //constructor
//        this.length = length;
//        this.width = width;
//    }
//
//
//    public int getArea() {
////        area = length x width
//        return length * width;
//    }
//
//    public int getPerimeter() {
////        perimeter = 2 x length + 2 x width
//        return (length + width) * 2;
//    }





}
