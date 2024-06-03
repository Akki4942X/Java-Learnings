import java.util.*;

public class addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The addition of two Numbers is:" + sum);

        sc.close();
    }
}
