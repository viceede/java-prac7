public class TestComparable {
    public static void main(String[] args) {
        try {
            Triangle triangle1 = new Triangle(3, 4, 5, "красный", true);
            Triangle triangle2 = new Triangle(5, 12, 13, "синий", false);

            System.out.println("=== Сравнение треугольников ===");
            System.out.println("Треугольник 1 площадь: " + triangle1.getArea());
            System.out.println("Треугольник 2 площадь: " + triangle2.getArea());
            System.out.println("Наибольший треугольник (по площади): ");
            GeometricObject maxTriangle = GeometricObject.max(triangle1, triangle2);
            System.out.println(maxTriangle);

            Circle circle1 = new Circle(5, "зеленый", true);
            Circle circle2 = new Circle(7, "желтый", false);

            System.out.println("\n=== Сравнение кругов ===");
            System.out.println("Круг 1 площадь: " + circle1.getArea());
            System.out.println("Круг 2 площадь: " + circle2.getArea());
            System.out.println("Наибольший круг (по площади): ");
            GeometricObject maxCircle = GeometricObject.max(circle1, circle2);
            System.out.println(maxCircle);

            Rectangle rectangle1 = new Rectangle(4, 6, "оранжевый", true);
            Rectangle rectangle2 = new Rectangle(3, 8, "фиолетовый", false);

            System.out.println("\n=== Сравнение прямоугольников ===");
            System.out.println("Прямоугольник 1 площадь: " + rectangle1.getArea());
            System.out.println("Прямоугольник 2 площадь: " + rectangle2.getArea());
            System.out.println("Наибольший прямоугольник (по площади): ");
            GeometricObject maxRectangle = GeometricObject.max(rectangle1, rectangle2);
            System.out.println(maxRectangle);

            ComparableCircle compCircle1 = new ComparableCircle(5, "красный", true);
            ComparableCircle compCircle2 = new ComparableCircle(8, "синий", false);

            System.out.println("\n=== Сравнение ComparableCircle (по радиусу) ===");
            System.out.println("ComparableCircle 1 радиус: " + compCircle1.getRadius());
            System.out.println("ComparableCircle 2 радиус: " + compCircle2.getRadius());

            int comparison = compCircle1.compareTo(compCircle2);
            if (comparison > 0) {
                System.out.println("Наибольший круг (по радиусу): ComparableCircle 1");
            } else if (comparison < 0) {
                System.out.println("Наибольший круг (по радиусу): ComparableCircle 2");
            } else {
                System.out.println("Круги равны по радиусу");
            }

            System.out.println("\n=== Сравнение ComparableCircle (по площади) ===");
            System.out.println("ComparableCircle 1 площадь: " + compCircle1.getArea());
            System.out.println("ComparableCircle 2 площадь: " + compCircle2.getArea());

            int areaComparison = compCircle1.compareByArea(compCircle2);
            if (areaComparison > 0) {
                System.out.println("Наибольший круг (по площади): ComparableCircle 1");
            } else if (areaComparison < 0) {
                System.out.println("Наибольший круг (по площади): ComparableCircle 2");
            } else {
                System.out.println("Круги равны по площади");
            }

            System.out.println("\n=== Сравнение круга и прямоугольника (по площади) ===");
            System.out.println("Круг площадь: " + compCircle1.getArea());
            System.out.println("Прямоугольник площадь: " + rectangle1.getArea());
            System.out.println("Наибольший объект (по площади): ");
            GeometricObject maxObject = GeometricObject.max(compCircle1, rectangle1);
            System.out.println(maxObject.getClass().getSimpleName() +
                    " с площадью: " + maxObject.getArea());

        } catch (IllegalTriangleException e) {
            System.out.println("Ошибка создания треугольника: " + e.getMessage());
        }
    }
}