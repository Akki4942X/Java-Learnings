
public class Reverse {
    public static void rev(int numbers[]) {
        int start = 0, end = numbers.length - 1;
        while (start < end) {
            int temp = numbers[end];
            numbers[end] = numbers[start];
            numbers[start] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 6, 7, 8, 9, 10 };

        rev(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }
        System.out.println();
    }
}
