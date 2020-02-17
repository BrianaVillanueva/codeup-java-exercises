package shapes;

//change your existing Rectangle class to inherit from Quadrilateral and implement Measurable.
public abstract class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(int length, int width) { //this is a default constructor intellij prompted for after adding the extends and implements
        super(length, width);
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
