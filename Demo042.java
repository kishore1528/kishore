import java.util.Scanner;

public class Demo042 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a char:");
            char c = sc.next().charAt(0);

            char upper;
            if (Character.isLowerCase(c)) {
                upper = Character.toUpperCase(c);
            } else {
                upper = c;
            }

            System.out.println("Upercase of " + c + " char: " + upper);
        }
    }
}