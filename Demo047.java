import java.util.Scanner;

public class Demo047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int count = 0;
        int num = Math.abs(number);

        while (num != 0) {
            num /= 10;
            count++;
        }

        System.out.println("The number of digits in " + number + " is: " + count);

        scanner.close();
    }
}