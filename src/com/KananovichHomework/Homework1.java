package com.KananovichHomework;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();

    }


    public static void task1() {
        //1. Напишите программу, которая вычисляет ваш вес на Луне с учетом того,
        // что сила тяжести равна 16% от силы тяжести на Земле.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свой вес");
        float weight = scanner.nextFloat();
        float moonGravity = 0.16f;
        float weightOnMoon = moonGravity * weight;
        System.out.println("Ваш вес на Луне =" + weightOnMoon);

    }


    public static void task2() {
        //Напишите метод, который будет увеличивать каждый элемент массива на 10%.
        int[] array = new int[10];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;
        array[5] = 60;
        array[6] = 70;
        array[7] = 80;
        array[8] = 90;
        array[9] = 100;

        for (int i = 0; i < array.length; i++) {
            System.out.println(" ячейка № " + i + " имеет размерность " + array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(" ячейка № " + i + " увеличенная на 10% имеет размерность " + array[i] * 1.1);
        }
    }

    public static void task3() {
        //Напишите метод, который будет проверять является ли число палиндромом
        // (одинаково читающееся в обоих направлениях)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        int sum = 0, r;
        int temp = number;
        while (number > 0) {
            r = number % 10;
            sum = (sum * 10) + r;
            number = number / 10;
        }
        if (temp == sum)
            System.out.println("Это число палиндром");
        else
            System.out.println("это не число палиндром");

    }

    public static void task4() {
        //Вывести на экран все четные цифры от 1 до 100 (используйте остаток от деления)

        for (int k = 100; k > 0; k--) {
            if (k % 2 == 0)
                System.out.println("Четное число " + k);

        }
    }

    public static void task5() {
        //Вывести на  экран все нечетные цифры от 1 до 15 (используйте остаток от деления)
        for (int w = 1; w < 16; w++) {
            if (w % 2 != 0)
                System.out.println("Нечетное число " + w);
        }

    }

    public static void task6() {
        //Вывести на  экран все четные цифры от 1 до 100 не используя остаток от деления (используя только цикл for)
        for (int q = 2; q <= 100; q += 2) {
            System.out.println("Четное число " + q);
        }

    }

    public static void task7() {
        //Посчитать сумму цифр от 20 до 200 и результат вывести на экран (используя цикл for)
        int sum = 0;
        for (int e = 20; e <= 200; e++) {
            sum = sum + e;
        }
        System.out.println("Сумма цифр от 20 до 200 = " + sum);

    }

    public static void task8() {
        //Пройти циклом по числам от 1 до 12 и вывести название месяца,
        // соответствующее каждому числу (используя цикл и оператор if else)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Номер месяца");
        int numberOfMonth = scanner.nextInt();
        int i = numberOfMonth;

        //for (int i = 1; i <= 12; i++) {


        if (i == 1) {
            System.out.println("Первый месяц Январь");
        }
        if (i == 2) {
            System.out.println("Второй месяц Ферваль");
        }
        if (i == 3) {
            System.out.println("Третий месяц Март");
        }
        if (i == 4) {
            System.out.println("Четвертый месяц Апрель");
        }
        if (i == 5) {
            System.out.println("Пятый месяц Май");
        }
        if (i == 6) {
            System.out.println("Шестой месяц Июнь");
        }
        if (i == 7) {
            System.out.println("Седьмой месяц Июль");
        }
        if (i == 8) {
            System.out.println("Восьмой месяц Август");
        }
        if (i == 9) {
            System.out.println("Девятый месяц Сентябрь");
        }
        if (i == 10) {
            System.out.println("Десятый месяц Октябрь");
        }
        if (i == 11) {
            System.out.println("Одиннадцатый месяц Ноябрь");
        }
        if (i == 12) {
            System.out.println("Двенадцатый месяц Декабрь");
        }
        if (i > 12) {
            System.out.println("Месяца с таким номером нет");
        }
    }


    public static void task9() {
        //Объявить 2 переменных целого типа. Необходимо поменять значения переменных так,
        // чтобы значение первой оказалось во второй, а второй - в первой.
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Введите значения а и b");
        int a = scanner3.nextInt();
        int b = scanner3.nextInt();
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b - (b = a);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }


    public static void task10() {
        //Напишите программу с тремя переменными целого типа, первым двум присвойте значения,
        // а третьей переменной присвойте их сумму. Выведете значение третей переменной на экран.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значения а и b");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int c = a + b;
        System.out.println("Сумма A и B равна " + c);
    }

    public static void task11() {
        //Напишите программу с тремя переменными целого типа. Определить какое из них наибольшее.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три числа");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a >= b && a >= c)
            System.out.println(a + " большее из чисел.");

        else if (b >= a && b >= c)
            System.out.println(b + " большее из чисел.");

        else
            System.out.println(c + " большее из чисел.");


    }

    public static void task12() {
        //Напишите программу, в которой используются две переменные логического типа (boolean),
        // присвойте им значения и выведете для каждой переменной на экран строку "истина",
        // если переменная имеет значение true и "ложь", если переменная имеет значение false.
        boolean x = true;
        boolean y = false;
        boolean z1 = x && y || y ^ x;
        boolean z2 = x && y && y ^ x;
        System.out.println("z1- " + z1 + " z2- " + z2);

    }

    public static void task13() {
        //Напишите программу, где двум строковым переменным присваиваются значения,
        // третей же строковой переменных присвойте объединение (конкатенацию) двух предыдущих строк.
        // Затем напечатайте значение третьей строковой переменной.
        String home = "домашняя ";
        String work = "работа";
        String homework = home + work;
        System.out.println(homework);


    }

    public static void task14() {
        //Создайте программу с двумя переменными целого типа, присвойте им значения,
        // если первая переменная больше второй, то увеличьте её значение на 3,
        // иначе увеличьте значение второй переменной на 8. В конце программы выведите значения обоих чисел на экран.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 числа");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("a= " + a + " b= " + b);

        if (a > b)
            a = a + 3;
        else
            b = b + 8;

        System.out.println("a= " + a + " b= " + b);


    }

    public static void task15() {
        //Выведете на экран все числа от 1 до 100 с помощью цикла (можно все три варианта в одной программе):
        //for
        //while
        //do while
        for (int i = 1; i <= 100; i++) {
            System.out.println("По циклу for " + i);

        }
        int a = 1;
        while (a <= 100) {
            System.out.println("По циклу while " + a);
            a++;
        }
        int b = 1;
        do {
            System.out.println("По циклу do  while " + b);
            b++;
        }
        while (b <= 100);


    }

    public static void task16() {
        //Вывести на экран ряд натуральных чисел от минимума до максимума с шагом.
        // Например, если минимум 10, максимум 35, шаг 5, то вывод должен быть таким: 10 15 20 25 30 35.
        // Минимум, максимум и шаг указываются пользователем (можно захардкодить).
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите минимальное значение");
        int a = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите максимальное значение");
        int b = scanner2.nextInt();
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Введите шаг");
        int c = scanner3.nextInt();
        for (int i = a; i <= b; i += c) {
            System.out.println(i);

        }

    }

    public static void task17() {
        //Все элементы массива поделить на значение наибольшего элемента этого массива.
        int arr[] = {55, 286, 318, 2, 4, 100, 47, 345, 128, 77, 225};
        double max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println("максимальный элемент массива " + max);
        for (double m : arr) {

            System.out.println("элемент массива разделенный на максимальное значение " + m / max);


        }
    }

    public static void task18() {
        //Напишите метод переводящий рубли в доллары по заданному курсу.
        // В качестве аргументов укажите кол-во рублей и курс.
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите сумму в рублях");
        double a = scanner1.nextDouble();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите курс доллара");
        double b = scanner2.nextDouble();
        double c = a / b;
        System.out.println("Получившаяся сумма в долларах " + c);


    }
}

















