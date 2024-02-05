public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1.");
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }

        System.out.println("Задание 2.");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("Задание 3.");
        for (int i = 1; i < 18; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("Задание 4.");
        for (int i = 10; i > -11; i--) {
            System.out.println(i);
        }

        System.out.println("Задание 5.");
        for (int i = 1904; i < 2097; i = i + 4) {
            System.out.println(i + "год является високосным");
        }

        System.out.println("Задание 6.");
        for (int i = 7; i < 99; i = i + 7) {
            System.out.println(i);
        }

        System.out.println("Задание 7.");
        for (int i = 1; i < 513; i = i * 2) {
            System.out.println(i);
        }
        System.out.println("Задание 8.");
        int total = 0;
        int salary = 29000;
        for (int i = 1; i < 13; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей ");
        }

        System.out.println("Задание 9.");
        int totalForYear = 0;
        int salaryInMonth = 29000;
        int percent = 12;
        for (int i = 1; i < 13; i++) {
            totalForYear = totalForYear + salaryInMonth;
            totalForYear = totalForYear + totalForYear * percent / 12 / 100;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalForYear + " рублей ");
        }

        System.out.println("Задание 10.");
        int resault;
        for (int i = 1; i < 11; i++) {
            resault = 2 * i;
            System.out.println("2*" + i + "=" + resault);
        }


    }
}