public class Square extends GeometricObject implements Colorable {
    private double side;

    public Square() {
        this.side = 0;
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        this.side = side;
        setColor(color);
        setFilled(filled);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public void howToColor() {
        System.out.println("Раскрасьте все четыре стороны");
    }

    @Override
    public String toString() {
        return "Квадрат со стороной = " + side +
                ", площадь = " + getArea() +
                ", периметр = " + getPerimeter();
    }
}