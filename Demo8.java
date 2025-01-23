import java.util.Scanner;
public class Demo8 {
public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String loginid = " ";
       String pwd = " ";
       String reply;
       do {
           System.out.println("welcome to Malla Reddy University");
           System.out.println("have you visited our site earlier");
           reply = sc.nextLine();
        System.out.println(reply);
               if(reply.equals("no")) {
                   System.out.println("login here");
                   System.out.println("enter ur id and pwd");
                   loginid = sc.nextLine();
                   pwd = sc.nextLine();
               }
               else{
                System.out.println("you are our valued customer");
                break;
               }
       } while ((loginid.equalsIgnoreCase("Prasunamba")) && (pwd.matches("12345") ));
   }
}