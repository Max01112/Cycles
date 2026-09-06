//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        System.out.println(" ");
        System.out.println("Задание 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println(" ");
        System.out.println("Задание 2");
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.println(i);
        }

        System.out.println(" ");
        System.out.println("Задание 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }

        System.out.println(" ");
        System.out.println("Задание 4");
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println(i);
        }

        System.out.println(" ");
        System.out.println("Задание 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i);
        }

        System.out.println(" ");
        System.out.println("Задание 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        System.out.println(" ");
        System.out.println("Задание 7");
        for (int i = 1; i <= 612; i = i * 2) {
            System.out.println(i);
        }

        System.out.println(" ");
        System.out.println("Задание 8");
        int money = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + money;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей.");
        }

        System.out.println(" ");
        System.out.println("Задание 9");
        double money1 = 29000;
        double total1 = 0;
        for (int i = 1; i <= 12; i++) {
            total1 = total1 * 1.01;
            total1 = total1 + money1;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total1 + " рублей.");
        }

        System.out.println(" ");
        System.out.println("Задание 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println(2 + " * " + i + " = " + i * 2);
        }
    }
}
