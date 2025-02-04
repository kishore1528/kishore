public class Demo015 {
    public static void main(String[] args) {
        int x = 10;
        int y = 15;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
