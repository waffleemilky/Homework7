public class Main {
    public static void main(String[] args) {

        //Задача 1

        int total = 0;
        int savings = 15000;
        int month = 0;
        while (total < 2_459_000) {
            total += savings;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }

//        Задача 2

        int i = 1;
        while (i <= 10) {
            System.out.print(" " + i + " ");
            i++;
        }
        System.out.println();
        for (int j = 10; j >= 1; j -= 1) {
            System.out.print(" " + j + " ");
        }
        System.out.println();

//        Задача 3

        int population = 12_000_000;
        int birthRatePer1000 = 17;
        int mortalPer1000 = 8;
        int yearNow = 2025;
        for (int year = yearNow; year < yearNow + 10; year++) {
            population += population * birthRatePer1000 / 1000 - population * mortalPer1000 / 1000;
            System.out.println("Год " + year + ", численность населения состовляет " + population);
        }

//        Задача 4

        int summa = 15000;
        int total1 = 0;
        int month1 = 0;
        while (total1 < 12_000_000) {
            total1 += ((total1 / 100) * 7);
            total1 += summa;
            month1++;
            System.out.println("Месяц " + month1 + ", сумма накоплений равна " + total1 + " рублей");
        }

//        Задача 5

        int summa2 = 15000;
        int total2 = 0;
        int month2 = 0;
        while (total2 < 12_000_000) {
            total2 += ((total2 / 100) * 7);
            total2 += summa2;
            month2++;
            if (month2 % 6 == 0) {
                System.out.println("Месяц " + month2 + ", сумма накоплений равна " + total2 + " рублей");
            }
        }

//        Задача 6

        int summa3 = 15000;
        int total3 = 0;
        int month3 = 0;
        while (month3 < 108) {
            total3 += ((total3 / 100) * 7);
            total3 += summa3;
            month3++;
            if (month3 % 6 == 0) {
                System.out.println("Месяц " + month3 + ", сумма накоплений равна " + total3 + " рублей");
            }
        }

//        Задача 7

        int friday = 5;
        while (friday <= 31){
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчёт");
            friday += 7;
        }

//        Задача 8

        int yearBefore = 2025 - 200;
        int yearAfter = 2025 + 100;
        for (int year = yearBefore; year < yearAfter; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }


    }
}