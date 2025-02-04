import java.util.Scanner;

class Customer {
    String Cust_Name = "Prasunamba";
    long Account_no = 123456;
    Double Balance = 10000.00;

    void accept_details() {
        System.out.println("Enter your name, account number and balance:");
        Scanner sc = new Scanner(System.in);

        // Accepting customer name
        Cust_Name = sc.nextLine();

        // Accepting account number
        Account_no = sc.nextLong();

        // Consuming leftover newline
        sc.nextLine();  // This will clear the buffer

        // Accepting balance
        Balance = sc.nextDouble();
    }

    void Display_details() {
        System.out.println("Hello " + Cust_Name);
        System.out.println("Your account number is " + Account_no);
        System.out.println("Your balance is " + Balance);
    }
}

public class Demo010 {
    public static void main(String[] args) {
        Customer obj = new Customer();
        obj.accept_details();
        obj.Display_details();
    }
}