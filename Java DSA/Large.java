
public class Large {

    public static int getLargest(int numbers[]) {
        int Largest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (Largest < numbers[i])
                Largest = numbers[i];
        }
        return Largest;
    }

    public static void main(String[] args) {
        int numbers[] = { 5, 6, 7, 8, 3, 9 };
        System.out.println("Largest element is" + getLargest(numbers));
    }

}
