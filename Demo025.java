public class Demo025 {
    public static void main(String[] args) {
        String str = "Hello everyone Happy sankranthi";

        StringBuilder reversedString = new StringBuilder(str);

        reversedString.reverse();
        System.out.println(reversedString.toString());
    }
}