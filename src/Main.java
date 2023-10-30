public class Main {
   public static void main(String[] args) {


// Task 6.1
      int[] arr = {1, 3, 4, 1, 5, 5};

      double a = 0;
      double b = 0;

      for (int i = 0; i < arr.length; i++) {
         a += arr[i];
         b = a / arr.length;
      }
      System.out.println(b);

      // Task 6.2

      for(int i = 0; i < arr.length; i++) {
         for(int j = i + 1; j < arr.length; j++) {
            if(arr[i] == arr[j])
               System.out.println(arr[j]);
         }
      }

      // Task 6.3

      int[] array = {1, 3, -6, 23, 14, 2};
      int x = 23;
      for (int i = 0; i < array.length; i++) {
         if (x == array[i]) {
            System.out.println("true");
         } else {
            System.out.println("false");
         }
      }

      int x1 = 0;
      for (int i = 0; i < array.length; i++) {
         if (x1 == array[i]) {
            System.out.println("true");
         } else {
            System.out.println("false");
         }
      }

      // Task 6.4
      int x2 = 23;

      for (int i = 0; i < array.length; i++) {
         if (x2 == array[i]) {
            System.out.println("индекс = " + i);
         }
      }

      int x3 = 5;

      for (int i = 0; i < array.length; i++){
         if (x3 != array[i]) {
            System.out.println("Не найдено");
         }

      }


      // Task 6.5

      int[] arr1 = {34, 82, 29, 30, 25, 40, 32, 31, 35, 410, 7};
      int n = 3;
      int m = 8;

      for ( int i = n; i <= m; i++) {
         System.out.println(arr1[i]);
      }

      int[] arr2 = {1, 3, -6, 23, 14, 2};
      int n1 = 1;
      int m1 = 3;

      for ( int i = n1; i <= m1; i++) {
         System.out.println(arr2[i]);
      }

      //6.6

      int[] arr3 = {1, 3, -6, 23, 14, 2};

      int min = arr[0];
      int max = arr[0];

      for (int i = 0; i < arr3.length; i++) {
         if (arr3[i] < min) {
            min = arr3[i];
         }

         if (arr3[i] > max) {
            max = arr3[i];
         }

      }
      System.out.println("min: " + min + "  max: " + max);

      // 6.7

      int firstmin = arr3[0];
      int secondmin = arr3[0];
      for ( int i = 0; i < arr3.length; i++) {
         if (arr3[i] < firstmin) {
            firstmin = arr3[i];
         }

         if(arr3[i] != firstmin && arr3[i] < secondmin) {
            secondmin = arr3[i];
         }
      }
      System.out.println("firstmin " + firstmin + "  secondmin " + secondmin);

      // 6.8
















   }
}