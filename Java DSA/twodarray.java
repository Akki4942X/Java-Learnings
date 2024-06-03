import java.util.*;

public class twodarray {
    public static void main(String arg[]) {
        int[][] akash = new int[4][5];
        Scanner sc = new Scanner(System.in);
        int i, temp;
        for (i = 0; i < 5; i++) {
            sc.nextInt();
            if (i <= 5) {
                temp = i + temp;
                temp++;
                System.out.println(temp);
            }

        }

        sc.close();
    }
}
