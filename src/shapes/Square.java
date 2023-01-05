package shapes;

public class Square extends Quadrilateral{

    protected double side;

    public Square(double side){
        super(side, side);
        this.side = side;

    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public void setLength(double length) {
        this.length = length;

    }

    @Override
    public void setWidth(double width){
        this.width = width;
    }

//    protected double side;
//
//    public Square(double side){
//        super(side, side);
//        this.side = side;
//    }
//
//    public double getPerimeter(){
//        System.out.println("get perimeter from square class");
//        return 4 * side;
//    }
//
//    public double getArea(){
//        System.out.println("get area from square class");
//        return Math.pow(side, 2);
//    }

}