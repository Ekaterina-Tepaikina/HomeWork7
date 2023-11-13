public class Main {
    public static void main(String[] args) {
        //Задача 1
        int deposit = 15000;
        float total = 0;
        short month = 1;
        while (total<2_460_000) {
            total = total + total/100f + deposit;
            System.out.println("Месяц " + month + ", сумма накоплений равна "+total+" рублей.");
            month++;
        }
        //Задача 2
        short s = 1;
        while (s < 11) {
            System.out.print(s + " ");
            s++;
        }
        System.out.println();
        for (byte i = 10; i>0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        //Задача 3
        int Y = 12_000_000;
        float birthRate = 17/1000f;
        float deathRate = 8/1000f;
        for (byte year = 1; year<11; year++) {
            Y = (int) (Y + (Y * birthRate) - (Y * deathRate));
            System.out.println("Год "+year+", численность населения составляет "+Y);
        }
        //Задача 4
        float dep = 15_000f;
        for (month=1; dep<12_000_001; month++) {
            dep = dep + dep/100*7f;
            System.out.println("Месяц "+month+", сумма накоплений: "+dep);
        }
        //Задача 5
        dep = 15_000f;
        for (month=1; dep<12_000_001; month++) {
            dep = dep + dep/100*7f;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений: " + dep);
            }
        }
        //Задача 6
        dep = 15_000f;
        for (month=1; month<109; month++) {
            dep = dep + dep/100*7f;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений: " + dep);
            }
        }
        //Задача 7
        int Friday = 6;
        for (; Friday<32; Friday=Friday+7) {
            System.out.println("Сегодня пятница, "+Friday+"-е число. Необходимо подготовить отчёт.");
        }
        //Задача 8
        short year200 = 2023 - 200;
        short year100 = 2023 + 100;
        for (int comet = 0; comet < year100; comet=comet+79) {
            if (comet>year200) {
                System.out.println(comet);
            }
        }

    }
}