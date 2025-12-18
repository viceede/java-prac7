// File: TestColorable.java (для задания 4)
public class TestColorable {
    public static void main(String[] args) {
        // Создание массива из 5 GeometricObject
        GeometricObject[] shapes = new GeometricObject[5];

        try {
            shapes[0] = new Circle(5, "красный", true);
            shapes[1] = new Rectangle(3, 4, "синий", false);
            shapes[2] = new Square(6, "зеленый", true);
            shapes[3] = new Triangle(3, 4, 5, "желтый", false);
            shapes[4] = new Square(4, "фиолетовый", true);

            // Обработка каждого объекта
            for (int i = 0; i < shapes.length; i++) {
                System.out.println("\n=== Объект " + (i + 1) + " ===");
                System.out.println("Тип: " + shapes[i].getClass().getSimpleName());
                System.out.println("Площадь: " + shapes[i].getArea());
                System.out.println("Цвет: " + shapes[i].getColor());
                System.out.println("Закрашен: " + shapes[i].isFilled());

                // Проверка, реализует ли объект интерфейс Colorable
                if (shapes[i] instanceof Colorable) {
                    System.out.print("Инструкция по раскрашиванию: ");
                    ((Colorable) shapes[i]).howToColor();
                } else {
                    System.out.println("Этот объект не раскрашиваемый");
                }
            }

        } catch (IllegalTriangleException e) {
            System.out.println("Ошибка создания треугольника: " + e.getMessage());
        }
    }
}