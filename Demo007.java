import java.util.Scanner;

public class Demo007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("please enter your name:");
       String name = sc.next();
       System.out.print("Enter your age:");
       int age = sc.nextInt();
       System.out.print("enter your phone number:");
       Long phn = sc.nextLong();
       sc.close();
       System.out.println("hello your  name is: "+name+",age is "+age+" and phn number is "+phn);
    }
}