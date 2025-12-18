// File: Triangle.java
public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    /** Создает треугольник с заданными по умолчанию сторонами (1.0) */
    public Triangle() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    /** Создает треугольник с указанными сторонами */
    public Triangle(double side1, double side2, double side3)
            throws IllegalTriangleException {
        if (isValidTriangle(side1, side2, side3)) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            throw new IllegalTriangleException();
        }
    }

    /** Создает треугольник с указанными сторонами, цветом и заливкой */
    public Triangle(double side1, double side2, double side3,
                    String color, boolean filled) throws IllegalTriangleException {
        this(side1, side2, side3);
        setColor(color);
        setFilled(filled);
    }

    /** Проверяет, могут ли стороны образовать треугольник */
    private boolean isValidTriangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    /** Возвращает side1 */
    public double getSide1() {
        return side1;
    }

    /** Возвращает side2 */
    public double getSide2() {
        return side2;
    }

    /** Возвращает side3 */
    public double getSide3() {
        return side3;
    }

    /** Присваивает новые стороны с проверкой */
    public void setSides(double side1, double side2, double side3)
            throws IllegalTriangleException {
        if (isValidTriangle(side1, side2, side3)) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            throw new IllegalTriangleException();
        }
    }

    /** Возвращает площадь треугольника */
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    /** Возвращает периметр треугольника */
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    /** Возвращает строковое представление треугольника */
    @Override
    public String toString() {
        return "Треугольник: сторона1 = " + side1 +
                " сторона2 = " + side2 +
                " сторона3 = " + side3;
    }
}