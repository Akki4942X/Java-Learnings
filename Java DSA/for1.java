public class for1 {
    public static void main(String[] args) {
        int a[] = { 10, 5, 11, 10, 5 };
        boolean isUnique;

        for (int i = 0; i < a.length; i++) {
            isUnique = true;
            for (int j = 0; j < a.length; j++) {
                if (i != j && a[i] == a[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.println("Unique no. is: " + a[i]);
            }
        }
    }
}