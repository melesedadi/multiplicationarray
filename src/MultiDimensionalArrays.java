import java.util.Random;

public class MultiDimensionalArrays {
    public static void main(String[] args) {

        int[] arr = new int[5];
        // use random
        for (int i = 0; i < arr.length; i++) {
            Random rnd = new Random();
            arr[i] = 1 + rnd.nextInt(12);

        }

        System.out.println("Length of arr1 is: " + arr.length);

        for (int i : arr) {
            System.out.println("arr : " + i);
        }
        System.out.println(" Multiplication table for number between 1 & 12:");
        {
         int []multiplication = new int [12];
         for (int i = 1; i<=multiplication.length;i++){
                        

             for (int j= 1; j<=multiplication.length;j++){
                 System.out.format("%4d",i*j);

             }
             System.out.println();
         }

        }
    }
}