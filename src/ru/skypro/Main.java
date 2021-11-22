package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here

        byte a = 100;
        System.out.println(a);

        short a1 = 500;
        System.out.println(a1);

        int a2 = 1000;
        System.out.println(a2);

        long a3 = 9999999L;
        System.out.println(a3);

        float a4 = 1.9f;
        System.out.println(a4);

        double a5 = 499.9;
        System.out.println(a5);

        boolean b = true;
        System.out.println(b);
        boolean c = false;
        System.out.println(c);

        double boxer1 = 78.2;
        System.out.println(boxer1);
        double boxer2 = 82.7;
        System.out.println(boxer2);
        System.out.println("Вес первого боксера = " + boxer1 + " кг");
        System.out.println("Вес второго боксера = " + boxer2 + " кг");
        double totalWeightBoxer = boxer1 + boxer2;
        System.out.println("Общий вес боксеров = " +totalWeightBoxer+ " кг");
        double weightDifference = boxer2 - boxer1;
        System.out.println("Разница веса боксеров = " +weightDifference+ " кг");

        var banana = 80 ;
        var milk = 105 ;
        var icecream = 100;
        var egs = 70;
        float cocktailGramm = (banana * 5) + (milk * 2) + icecream + (egs *4);
        System.out.println("Общий вес спорт питания = " +cocktailGramm+ " гр");
        float cocktailKg = cocktailGramm/1000;
        System.out.println("Масса спорт питания = " +cocktailKg+ " кг");


        int oneKg = 1000;
        System.out.println("1 Кг = " +oneKg+ " гр");
        int excessWeight = 7 * oneKg;
        System.out.println("Лишний вес спортсмена = " +excessWeight+ " гр");
        var day250 = excessWeight/250;
        var day500 = excessWeight/500;
        System.out.println("Количество дней если терять по 250 гр = " + day250 + " дней");
        System.out.println("Количество дней если терять по 500 гр = " + day500 + " дней");
        var average = (day250 + day500)/2;
        System.out.println("Среднее количество  = " +average+ " день");

        int zpDenis = 83690;
        int zpKristina = 76230;
        int zpMasha = 67760;
        int zpMashaYear = zpMasha * 12;
        System.out.println("Зарплата Маши за год состовляет " +zpMashaYear+ " рублей");
        int zpDenisYear = zpDenis*12;
        System.out.println("Зарплата Дениса за год состовляет "  +zpDenisYear+ " рублей");
        int zpKristinaYear = zpKristina*12;
        System.out.println("Зарплата Кристины за год состовляет "  +zpKristinaYear+ " рублей");
        zpMasha = zpMasha + zpMasha * 10/100;
        System.out.println("Теперь зарплата Маши стала "  +zpMasha+ " рублей");
        zpDenis = zpDenis + zpDenis * 10/100;
        System.out.println("Теперь зарплата Дениса стала " +zpDenis+ " рублей");
        zpKristina = zpKristina + zpKristina * 10/100;
        System.out.println("Теперь зарплата Кристины стала " +zpKristina+ " рублей");
        int zpMashaYear1 = zpMasha*12;
        System.out.println("Теперь зарплата Маши за год стала "  +zpMashaYear1+ " рублей");
        int zpDenisYear1 = zpDenis*12;
        System.out.println("Теперь зарплата Дениса за год стала "  +zpDenisYear1+ " рублей");
        int zpKristinaYear1 = zpKristina*12;
        System.out.println("Теперь зарплата Кристины за год стала "  +zpKristinaYear1+ " рублей");
        int differenceZpMasha = zpMashaYear1-zpMashaYear;
        System.out.println("Годовой доход Маши вырос на " +differenceZpMasha+ " рублей");
        int differenceZpDenis = zpDenisYear1-zpDenisYear;
        System.out.println("Годовой доход Дениса вырос на " +differenceZpDenis+ " рублей");
        int differenceZpKristina = zpKristinaYear1-zpKristinaYear;
        System.out.println("Годовой доход Кристины вырос на " +differenceZpKristina+ " рублей");
    }
}
