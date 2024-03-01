import java.util.Scanner;

public class Maximus {   // Объявляем класс Maximus
    public static void main(String[] args) {  // Объявляем метод main, который является точкой входа в программу.
        Scanner scanner = new Scanner(System.in);  // Создаем объект класса Scanner для считывания ввода с клавиатуры.

        System.out.print("Введите выражение (Например:1+2): ");
        String input = scanner.nextLine();  // Считываем строку введенную пользователем

        String[] parts = input.split("");  //Разбиваем введенную строку на части по пробелам и сохраняем в массив строк

        if (parts.length != 3) {
            System.out.println("Ошибка: Допустим ввод только двух операндов и одного оператора");  //Проверяем, что введенное выражение содержит три части: операнд1, оператор, операнд2.
            return;
        }

        int operand1 = Integer.parseInt(parts[0]);
        char operator = parts[1].charAt(0);
        int operand2 = Integer.parseInt(parts[2]);

        int result = 0;
        switch (operator) {    //  Используем оператор switch для выполнения определенных операций (+,-,*,/)
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                if (operand2 != 0) {
                    result = operand1 / operand2;
                } else {
                    System.out.println("Ошибка.На ноль делить нельзя");
                    return;
                }
                break;
            default:
                System.out.println("Ошибка. Введите оператор(+,-,*,/)");
                return;
        }

        System.out.println("Результат: " + result);
    }
}