import java.util.Scanner;

public class Demo037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter Third number: ");
        int num3 = sc.nextInt();
        System.out.println("Enter Fourth number: ");
        int num4 = sc.nextInt();

        if ((num1 > num2) && (num1 > num3) && (num1 > num4)) {
            System.out.println("The biggest number is: " + num1);
        } else if ((num2 > num1) && (num2 > num3) && (num2 > num4)) {
            System.out.println("The biggest number is: " + num2);
        } else if ((num3 > num1) && (num3 > num2) && (num3 > num4)) {
            System.out.println("The biggest number is: " + num3);
        } else if ((num4 > num1) && (num4 > num2) && (num4 > num3)) {
            System.out.println("The biggest number is: " + num4);
        } else {
            System.out.println("All are equal");
        }
    }
}