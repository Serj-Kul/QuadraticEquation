import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Sergey on 3/6/2017.
 */
public class QuadraticEquation {
    public static void main(String[] args) {
        System.out.println("Решение квадратного уравнения вида a*x^2 + b*x + c = 0, " +
                "где a, b, c — некоторые числа (a ≠ 0), x — неизвестное.");
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.println("Введите первый аргумент (a):");
        double a = readDouble(input, "Введите первый аргумент a!");

        System.out.println("Введите первый аргумент (b):");
        double b = readDouble(input, "Введите первый аргумент b!");

        System.out.println("Введите первый аргумент (c):");
        double c = readDouble(input, "Введите первый аргумент c!");


        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

        // Проверка

        if (a == 0) {
            LinearEq(b, c);
        } else {
            QuadEq(a, b, c);
        }
    }

    // Метод решения квадратного уравнения
    private static void QuadEq(double a, double b, double c) {
        System.out.println("Квадратное уравнение");
        double D = b * b - 4 * a * c;

        if (D > 0) {
            System.out.println("Уравнение имеет два корня");
            System.out.println("x1 = " + (-b + Math.sqrt(D))/ (2 * a));
            System.out.println("x2 = " + (-b - Math.sqrt(D))/ (2 * a));
        } else if (D == 0) {
            System.out.println("Уравнение имеет один корень");
            System.out.println("x = " + (-b / (2 * a)));
        } else {
            System.out.println("Корней нет");
        }
    }

    // Метод решения линейного уравнения
    private static void LinearEq (double a, double b) {
        System.out.println("Уравнение линейное");
        if (a == 0 & b == 0) {
            System.out.println("x - любое");
        } else if (a == 0 & b != 0) {
            System.out.println("Нет решений");
        } else {
            System.out.println("x = " + (-b / a));
        }
    }

    // Метод проверки ввода аргументов
    private static double readDouble (Scanner input, String message) {
        while(true) {
            if (input.hasNextDouble()) {
                return input.nextDouble();
            } else {
                System.out.println("Вы ввели не число! " + message);
                input.next();
            }
        }
    }
}
