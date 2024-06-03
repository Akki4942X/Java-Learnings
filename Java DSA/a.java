import java.util.*;

public class a {
    int binarysearch(int arr[], int n, int k) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                System.out.println(k + " appears at index " + i);
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number to search for: ");
        int k = sc.nextInt();

        a obj = new a();
        int result = obj.binarysearch(arr, n, k);

        if (result == -1) {
            System.out.println(k + " not found in the array.");
            sc.close();
        }
    }
}