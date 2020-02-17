package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//    Rectangle box1 = new Rectangle(4, 5);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//
//    Rectangle box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());




        Measurable myShape; //declare a variable of the type Measurable named myShape.
    /*
    Test your code by creating instances of both Square and Rectangle and assigning
    them to myShape so you can display the shape's area and perimeter.
     */
        myShape = new Rectangle(2, 4);

        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

        myShape = new Square(2);


        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());
    }
}
