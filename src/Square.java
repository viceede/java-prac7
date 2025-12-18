// File: Square.java
public class Square extends GeometricObject implements Colorable {
    private double side;

    /** Создает квадрат со стороной 0 */
    public Square() {
        this.side = 0;
    }

    /** Создает квадрат с указанной стороной */
    public Square(double side) {
        this.side = side;
    }

    /** Создает квадрат с указанной стороной, цветом и заливкой */
    public Square(double side, String color, boolean filled) {
        this.side = side;
        setColor(color);
        setFilled(filled);
    }

    /** Возвращает сторону квадрата */
    public double getSide() {
        return side;
    }

    /** Устанавливает сторону квадрата */
    public void setSide(double side) {
        this.side = side;
    }

    /** Возвращает площадь квадрата */
    @Override
    public double getArea() {
        return side * side;
    }

    /** Возвращает периметр квадрата */
    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    /** Реализация метода интерфейса Colorable */
    @Override
    public void howToColor() {
        System.out.println("Раскрасьте все четыре стороны");
    }

    /** Возвращает строковое представление квадрата */
    @Override
    public String toString() {
        return "Квадрат со стороной = " + side +
                ", площадь = " + getArea() +
                ", периметр = " + getPerimeter();
    }
}