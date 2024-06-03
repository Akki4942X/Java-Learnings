public class decreaserecu {
    public static void printDrec(int n) {

        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printDrec(n - 1);
    }

    public static void main(String[]args)
    {
        int n=10;
       printDrec(n); 
       
    }

}
