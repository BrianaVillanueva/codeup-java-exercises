package shapes;

public class Square extends Rectangle {

        int side; //a property. This makes the below constructor and getArea/getPerimeter work


    /*define a constructor that accepts one argument, side, and calls the parent's
    constructor to set both the length and width to the value of side.*/
    public Square(int side) {
        super(side, side); //the super keyword here replaced length & width w side
        this.side = side;
    }

    public int getArea(){
        return side * side; //side^2
    }

    public int getPerimeter() {
        return side * 4; //4 x side
    }



}
