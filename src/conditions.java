public class conditions {
    public static void conditions(String[] args) {
        //Задание №3
        // 1.
       /* String flowersName = "Roses";
        int flowersNumber = 101;
        System.out.println(flowersName);
        System.out.println(flowersNumber);

        int a = 15;
        int b = 10;
        int c1 = a + b;
        System.out.println(c1);

        int x, z, y;
        x = 4;
        z = 5;
        y = 3;
        System.out.println(x + z +y);

        int f, g, h, i;
        f = g = h = i = 20;
        System.out.println(f + g + h + i);

        */

        // 2. 1)

        //2. 3)
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4;
        double f = 5.2;
        float g = 6.234f;
        boolean h = true;
        char j = 'C';
        String UserName = "Ereke";

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(j);
        System.out.println(UserName);






        /*
        // Задание №4
        // . 1.

        int b1 = 10;
        int b2 = 5;

        System.out.println(b1 * b2);

        //2.

        int c = 20;
        double d = 2.5;

        System.out.println(c / d);

        //3.

        int длина = 15;
        int ширина = 9;

        System.out.println(длина * ширина);
        System.out.println(длина + ширина + длина + ширина);

        //4.

        int v = 1;
        System.out.println(v++);
        System.out.println(++v);

        //5.

        int x1 = 10;
        System.out.println(x1+=5);

        //6.

        int x2 = 25;
        int x3 = 43;
        System.out.println(x2 == x3);

        //7.

        int a1 = 10;
        int a2 = 5;

        int sum = a1 + a2;
        int sum1 = a1 - a2;
        int sum2 = a1 * a2;
        int sum3 = a1 / a2;
        int sum4 = a1 % a2;
        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);
        */
        // 8.

        int fahrenheit = 50;
        System.out.println("Celcius:" +  (fahrenheit-32) * 5/9);

        // 9.

        System.out.println((10+451) / 3 + 5 * 5);

        // 10.
        int a1 = 65;
        int b1 = 80;
        if (a1 < 50 && a1 < b1) {
            System.out.println("Верно");
        } else {
            System.out.println("Не верно");
        }


        // Задание №5

        // 1.
        int w = 10;
        int z = 5;

        if (w == z) {
            System.out.println("Длина и ширина ровны");
        } else {
            System.out.println("Не ровны");
        }

        // 2.
        double summa = 10000;
        if (summa > 5000) {
            summa = summa - (summa * 0.1);
        }

        System.out.println(summa);


        // 3.
        int grade = 25;

        if (grade < 25) {
            System.out.println("F");
        } else if (grade >= 25 && grade < 45) {
            System.out.println("E");
        } else if (grade >= 45 && grade < 50 ) {
            System.out.println("D");
        } else if (grade >= 50 && grade < 60) {
            System.out.println("C");
        } else if (grade >= 60 && grade < 80) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }

        // 4.

        int n = 12345;
        while (n > 0) {
            int r = (n % 10);
            n = n / 10;

            System.out.println(r);
        }

        // 5.

        int num = 1;
        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                System.out.println("Не простое");
                break;
            }
        }
        if (isPrime) {
            System.out.println("Простое");
        }


//        Дополнительные задачи 1.

        int find = 5;

        if (find % 2 == 0) {
            System.out.println("Четное число");
        } else {
            System.out.println("нечетное число");
        }

//        2.

        int n1 = 5;
        int n2 = 10;
        if (n1 > n2) {
            System.out.println("n1 - Больше");
        } else if (n1 < n2) {
            System.out.println("n2 - Больше");
        }

//        3.

        int god = 2023;
        if (god %4 == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Не является високосным");
        }

//        4.

        int days = 5;

        switch (days) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресение");
        }
        // 5.



//        6.

        int x = 3;
        int y = 4;
        int v = 5;

        if (x == y && x == v && y == v) {
            System.out.println("равносторонний");
        } else if (x == y && x != v && y != v) {
            System.out.println("равнобедренный");
        } else if (x != y && x != v && y != v) {
            System.out.println("разносторонний");
        }
    }
}
