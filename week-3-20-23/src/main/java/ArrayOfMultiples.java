import java.util.Scanner;

public class ArrayOfMultiples {
    public static int[] arrayOfMultiples(int num, int length) {
        int[] multiples = new int[length];

        for (int i = 0; i < length; i++) {
            multiples[i] = num * (i + 1);
        }

        return multiples;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Prompt user for the num and length of array
        System.out.print("Enter number you want to find the multiples of: ");
        int num = sc.nextInt();
        System.out.print("Enter the length of the array: ");
        int length = sc.nextInt();

        //call arrayOfMultiples function and print result
        int[] result = arrayOfMultiples(num, length);
        System.out.print("Result: ");

        for (int i = 0; i<result.length; i++) {
            System.out.print(result[i]);

            //The statement will give spacing and
            //no comma at the end of the array.
            if(i != result.length - 1) {
                System.out.print(", ");
            }
        }

        sc.close();
    }
}
