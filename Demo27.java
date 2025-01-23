import java.util.Scanner;
import java.util.stream.IntStream;

public class Demo27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        boolean isPrime = num > 1 && IntStream.range(2, (int) Math.sqrt(num) + 1).noneMatch(i -> num % i == 0);

        System.out.println(isPrime ? num + " is prime" : num + " is not prime");
    }
}