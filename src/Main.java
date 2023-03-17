public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15_000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            total = salary + total;
            month++;
            System.out.println("Месяц " + month + " , сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10){
            System.out.print(" " + i + " ");
            i++;
        }
        System.out.println();
        for ( i = 10; i >= 1; i--){
            System.out.print(" " + i + " ");
        }
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int fertilityRate = 17;
        int mortalityRate = 8;
        int fertilityPerYear = 0;
        int mortalityPerYear = 0;
        int year = 0;
        while (year <= 10) {
            fertilityPerYear = population / 1_000 * fertilityRate;
            mortalityPerYear = population / 1_000 * mortalityRate;
            population = population + fertilityPerYear - mortalityPerYear;

            System.out.println("Год " + year + " , численность населения составляет " + population);
            year++;
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int salary = 15_000;
        int total = 0;
        int perSent = 7%100;
        int month = 0;
        while (total < 12_000_000) {
            total = total+ salary * perSent;
            month++;
            System.out.println("За " + month + " месяц, накоплено " + total);
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int salary = 15_000;
        int total = 0;
        int perSent = 7%100;
        int month = 0;
        while (total < 12_000_000) {
            total = total+ salary * perSent;
            month++;
            if (month % 6 == 0) {
                System.out.println("За " + month + " месяцев, накоплено " + total);
            }
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        int month = 0 ;
        int salary = 15_000;
        int perSent = 7%100;
        int total = 0;
        while (month < 9 * 12) {
            total = total + salary * perSent;
            month++;
            if (month % 6 == 0) {
                System.out.println("За " + month + " месяцев, накоплено " + total);
            }
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int day = 5;
        while ( day < 31) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
            day = day + 7;
        }
    }
    public static void task8() {
        System.out.println("Задача 8");
        int everyYear = 79;
        for (int until = 79;until <2023 + 100; until = until + everyYear) {
            if (until > 2023-200 && until < 2023 + 100) {
                System.out.println(until);
            }
        }
    }
}