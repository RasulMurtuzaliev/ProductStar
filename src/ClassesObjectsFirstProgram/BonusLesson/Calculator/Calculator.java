package ClassesObjectsFirstProgram.BonusLesson.Calculator;

import java.util.Scanner;

public class Calculator {
    private static final Double[] results = new Double[10];

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int i = 0;
        for (; ; ) {
            System.out.println(String.format("Memory fuel on %d / 9 ", i));
            if (i == 9) {
                print();
            }
            System.out.println("Enter \"exit\" to complete: ");
            String s = reader.next();
            if (s.equalsIgnoreCase("exit")) {
                print();
                break;
            }
            System.out.print("Введите 2 числа ");
            double first = reader.nextDouble();
            double second = reader.nextDouble();
            System.out.print("Введите оператор: (+, -, *, /): ");
            char operator = reader.next().charAt(0);
            double result = 0.0;
            switch (operator) {
                case '+':
                    result = first + second;
                    i++;
                    results[i] = result;
                    break;
                case '-':
                    result = first - second;
                    i++;
                    results[i] = result;
                    break;
                case '*':
                    result = first * second;
                    i++;
                    results[i] = result;
                    break;
                case '/':
                    result = first / second;
                    i++;
                    results[i] = result;
                    break;
                default:
                    System.out.printf("Введите корректный оператор");
                    return;
            }
            System.out.printf("%.1f %c %.1f = %.1f\n", first, operator, second, result);
        }
    }

    private static void print() {
        for (Double aD : results) {
            System.out.println(aD);
        }
    }
}
