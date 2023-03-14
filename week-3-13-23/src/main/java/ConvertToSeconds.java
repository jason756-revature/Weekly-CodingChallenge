import java.util.Scanner;

public class ConvertToSeconds {

    public static int convert(int min) {
        return min * 60;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Get user input
        int min = sc.nextInt();
        int convertSeconds = convert(min);

        System.out.println(convertSeconds);

        sc.close();
    }
}
