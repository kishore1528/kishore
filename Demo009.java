import java.util.Scanner;

public class Demo009 {
    String Cust_Name = "Sanjay";
    long Account_no = 123456;
    Double Balance = 10000.00;

    void accept_details(){
        System.out.println("Enter your name, account number and balance:");
        Scanner sc = new Scanner(System.in);
        
        // Accepting customer name
        Cust_Name = sc.nextLine();
        
        // Accepting account number
        Account_no = sc.nextLong();
        
        // Accepting balance
        Balance = sc.nextDouble();
    }

    void Display_details(){
        System.out.println("Hello " + Cust_Name);
        System.out.println("Your account number is " + Account_no);
        System.out.println("Your balance is " + Balance);
    }

    public static void main(String[] args){
        Demo009 obj = new Demo009();
        obj.accept_details();
        obj.Display_details();
    }
}