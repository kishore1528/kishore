public class Demo020 {
    public static void main(String[] args) {

        System.out.println(getFizzBizz(33));
        System.out.println(getFizzBizz(5));
        System.out.println(getFizzBizz(15));
        System.out.println(getFizzBizz(7));
        System.out.println(getFizzBizz(0));
        System.out.println(getFizzBizz(-3));
    }

    public static String getFizzBizz(int num) {
        if (num <= 0) {
            return "Error";
        } else if (num % 3 == 0 && num % 5 == 0) {
            return "FIZZBIZZ";
        } else if (num % 3 == 0) {
            return "FIZZ";
        } else if (num % 5 == 0) {
            return "BIZZ";
        } else {
            return String.valueOf(num);
        }
    }
}