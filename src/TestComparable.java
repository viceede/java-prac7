// File: TestComparable.java (для задания 3)
public class TestComparable {
    public static void main(String[] args) {
        try {
            // Создание треугольников
            Triangle triangle1 = new Triangle(3, 4, 5, "красный", true);
            Triangle triangle2 = new Triangle(5, 12, 13, "синий", false);

            System.out.println("=== Сравнение треугольников ===");
            System.out.println("Треугольник 1 площадь: " + triangle1.getArea());
            System.out.println("Треугольник 2 площадь: " + triangle2.getArea());
            System.out.println("Наибольший треугольник: " +
                    GeometricObject.max(triangle1, triangle2));

            // Создание кругов
            Circle circle1 = new Circle(5, "зеленый", true);
            Circle circle2 = new Circle(7, "желтый", false);

            System.out.println("\n=== Сравнение кругов ===");
            System.out.println("Круг 1 площадь: " + circle1.getArea());
            System.out.println("Круг 2 площадь: " + circle2.getArea());
            System.out.println("Наибольший круг: " +
                    GeometricObject.max(circle1, circle2));

            // Создание прямоугольников
            Rectangle rectangle1 = new Rectangle(4, 6, "оранжевый", true);
            Rectangle rectangle2 = new Rectangle(3, 8, "фиолетовый", false);

            System.out.println("\n=== Сравнение прямоугольников ===");
            System.out.println("Прямоугольник 1 площадь: " + rectangle1.getArea());
            System.out.println("Прямоугольник 2 площадь: " + rectangle2.getArea());
            System.out.println("Наибольший прямоугольник: " +
                    GeometricObject.max(rectangle1, rectangle2));

            // Использование ComparableCircle
            ComparableCircle compCircle1 = new ComparableCircle(5, "красный", true);
            ComparableCircle compCircle2 = new ComparableCircle(8, "синий", false);

            System.out.println("\n=== Сравнение ComparableCircle ===");
            System.out.println("ComparableCircle 1 радиус: " + compCircle1.getRadius());
            System.out.println("ComparableCircle 2 радиус: " + compCircle2.getRadius());

            if (compCircle1.compareTo(compCircle2) > 0) {
                System.out.println("Наибольший круг: ComparableCircle 1");
            } else if (compCircle1.compareTo(compCircle2) < 0) {
                System.out.println("Наибольший круг: ComparableCircle 2");
            } else {
                System.out.println("Круги равны");
            }

            // Сравнение круга и прямоугольника
            System.out.println("\n=== Сравнение круга и прямоугольника ===");
            System.out.println("Круг площадь: " + compCircle1.getArea());
            System.out.println("Прямоугольник площадь: " + rectangle1.getArea());
            System.out.println("Наибольший объект: " +
                    GeometricObject.max(compCircle1, rectangle1));

        } catch (IllegalTriangleException e) {
            System.out.println("Ошибка создания треугольника: " + e.getMessage());
        }
    }
}