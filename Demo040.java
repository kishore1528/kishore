import java.util.Scanner;

public class Demo040 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a character: ");
            char input = sc.next().charAt(0);

            if (Character.isUpperCase(input)) {
                System.out.println(input + " is an uppercase letter.");
            } else if (Character.isLowerCase(input)) {
                System.out.println(input + " is a lowercase letter.");
            } else if (Character.isDigit(input)) {
                System.out.println(input + " is a digit.");
            } else {
                System.out.println(input + " is a special character");
            }
        }
    }
}