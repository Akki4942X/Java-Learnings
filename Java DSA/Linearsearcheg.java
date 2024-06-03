public class Linearsearcheg {

    public static int ls(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 3, 4, 5, 6, 7, 8, 9 };
        int key = 9;

        int index = ls(numbers, key);
        if (index == -1) {
            System.out.println("Number not Found");
        } else {
            System.out.println("Number found at index:" + index);

        }
    }

}
