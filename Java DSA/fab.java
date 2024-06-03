public class fab {
    public static void main(String[] args) {
        int num = 5;
        int result = fib(num);
        System.out.println(result);
    }

    public static int fib(int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }
        return fib(num - 1) + fib(num - 2);
    }
}