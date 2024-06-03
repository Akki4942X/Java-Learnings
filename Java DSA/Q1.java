import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        System.out.println("Enter Array Size");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Array Elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to be found");
        sc.close();
    }

}
