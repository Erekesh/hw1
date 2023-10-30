public class cicles {

    public static void cicles(String[] args) {
        // Task 5.2.4

        int number = 12345;
        int rev = 0;

        while (number != 0) {
            int rem = number % 10;
            number /= 10;
            rev = rev * 10 + rem;

        }
        System.out.println(rev);

        // Task 5.2.5

        int n = 5;
        boolean isComposite = false;

        if (n % 2 == 0) {
            isComposite = false;
        } else {
            for (int i = 3; i < n; i++) {
                if (n % i == 0) {
                    isComposite = true;
                    break;
                }
            }
        }

        if (isComposite) {
            System.out.println("Состовное число");
        } else {
            System.out.println("Простое число");
        }


        // Task 5.2.6

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        int size = 5;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Task 5.2.7

        int end = 10;
        int sum = 0;

        int start = 5;
        for (int counter = start; counter <= end; counter++) {
            sum += counter;
        }

        System.out.println("От" + start + "до" + end + ":" + sum);

        // Task 5.2.8

        int salary = 100000;
        char employeeGrade = 'A';

        switch (employeeGrade) {
            case 'A' -> salary *= 1.5;
            case 'B' -> salary *= 1.25;
        }

        System.out.println("Result salary: " + salary);

        // 5.2.9

        int num = 5;
        int n0 = 1;
        int n1 = 1;
        int n2;
        System.out.print(n0 + " " + n1 + " ");

        for (int i =3; i <= num; i++) {
            n2 = n0 +n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }


    }
}
