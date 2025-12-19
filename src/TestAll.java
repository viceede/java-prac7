import java.util.Scanner;

public class TestAll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== Меню тестирования ===");
            System.out.println("1. Тест Triangle (Задания 1 и 2)");
            System.out.println("2. Тест Comparable (Задание 3)");
            System.out.println("3. Тест Colorable (Задание 4)");
            System.out.println("4. Выход");
            System.out.print("Выберите опцию: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    TestTriangle.main(new String[]{});
                    break;
                case 2:
                    TestComparable.main(new String[]{});
                    break;
                case 3:
                    TestColorable.main(new String[]{});
                    break;
                case 4:
                    running = false;
                    System.out.println("Выход из программы...");
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }

        scanner.close();
    }
}