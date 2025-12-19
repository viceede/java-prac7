import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите три стороны треугольника:");
            System.out.print("Сторона 1: ");
            double side1 = scanner.nextDouble();
            System.out.print("Сторона 2: ");
            double side2 = scanner.nextDouble();
            System.out.print("Сторона 3: ");
            double side3 = scanner.nextDouble();

            scanner.nextLine(); // очистка буфера

            System.out.print("Введите цвет треугольника: ");
            String color = scanner.nextLine();

            System.out.print("Закрашен ли треугольник (true/false): ");
            boolean filled = scanner.nextBoolean();

            Triangle triangle = new Triangle(side1, side2, side3, color, filled);

            System.out.println("\n=== Информация о треугольнике ===");
            System.out.println(triangle);
            System.out.println("Площадь: " + triangle.getArea());
            System.out.println("Периметр: " + triangle.getPerimeter());
            System.out.println("Цвет: " + triangle.getColor());
            System.out.println("Закрашен: " + triangle.isFilled());

        } catch (IllegalTriangleException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ошибка ввода: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}