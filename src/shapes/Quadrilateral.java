package shapes;

// nothing is being used in shapes, so we do not need to extend it to Quad
//public abstract class Quadrilateral extends Shape implements Measurable{

public abstract class Quadrilateral implements Measurable{

    protected double length;
    protected double width;

    public Quadrilateral(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength(){
        return length;
    }

    //command + n will open the generate menu for getters and setters (key = protected, open lock = public)
    public double getWidth() {
        return width;
    }

    public abstract void setLength(double length);
    public abstract void setWidth(double width);
}