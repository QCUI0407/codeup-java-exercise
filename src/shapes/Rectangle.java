package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    protected double length;
    protected double width;

    public Rectangle (double length, double width){
        super(length, width);
        this.length = length;
        this.width = width;
    }
    @Override
    public double getPerimeter() {
        return (2*length) + (2*width);
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }



//    protected double length;
//    protected double width;
//
//    public Rectangle (double length, double width){
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getArea(){
//        System.out.println("get area from rectangle class");
//        return length * width;
//    }
//
//    public double getPerimeter(){
//        System.out.println("get perimeter from rectangle class");
//        return (2*length) + (2*width);
//    }
}