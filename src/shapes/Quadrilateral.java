package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    //protected properties for length and width.
    protected int length;
    protected int width;


    //a constructor that accepts two numbers for the length and width and sets those properties.
    public Quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;
    }

    //methods for getting the length and width.
    public abstract int getLength();

    public abstract int getWidth();

    //abstract methods for setting the length and width.
    public abstract void setLength();

    public abstract void setWidth();


}
