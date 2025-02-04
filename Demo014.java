public class Demo014 {

    public static void main(String[] args) {

        int number = 10;
        boolean condition = true;

        int positive = +number;
        System.out.println("Unary Plus: " + positive);

        int negative = -number;
        System.out.println("Unary Minus: " + negative);

        System.out.println("Original number: " + number);
        System.out.println("Post-increment: " + (number++));
        System.out.println("After Post-increment: " + number);
        System.out.println("Pre-increment: " + (++number));

        System.out.println("Original number: " + number);
        System.out.println("Post-decrement: " + (number--));
        System.out.println("After Post-decrement: " + number);
        System.out.println("Pre-decrement: " + (--number));

        System.out.println("Original condition: " + condition);
        System.out.println("Logical Complement: " + !condition);
    }
}