package shapes;

public class Square extends Quadrilateral {
    public Square(int side) {
        super(side, side);
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
    public double getPerimeter() { //this isnt an actual getter because you're using a method so you dont need "this."
        return length * 4;
    }

    @Override
    public double getArea() {
        return length * width;
    }
    /*---FIRST SQUARE EXERCISE -HAD TO COMMENT OUT FOR SECOND EXERCISE---*/
//        int side; //a property. This makes the below constructor and getArea/getPerimeter work
//
//
//    /*define a constructor that accepts one argument, side, and calls the parent's
//    constructor to set both the length and width to the value of side.*/
//    public Square(int side) {
//        super(side, side); //the super keyword here replaced length & width w side
//        this.side = side;
//    }
//
//    @Override
//    public int getArea(){
//        return side * side; //side^2
//    }
//    @Override
//    public int getPerimeter() {
//        return side * 4; //4 x side
//    }


}
