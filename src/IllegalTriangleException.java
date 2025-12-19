public class IllegalTriangleException extends Exception {
    public IllegalTriangleException() {
        super("Треугольник не может быть создан: сумма длин любых двух сторон должна быть больше длины третьей стороны");
    }

    public IllegalTriangleException(String message) {
        super(message);
    }
}