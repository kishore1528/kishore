import java.util.*;

public class Test002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String reply;
        while (true) {
            System.out.print("Reply (yes/no):");
            reply = sc.next();

            if (reply.equals("yes")) {
                System.out.println("Happy Sankranthi");
            } else {
                System.out.println("no");
                break;

            }
            sc.close();
        }
    }
}