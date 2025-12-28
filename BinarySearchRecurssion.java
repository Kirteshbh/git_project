
import java.util.Arrays;

class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        System.out.println(Arrays.toString(arr));

        int key = 9;
        int pos = binarySearch(arr, key);

        if (pos != -1) {
            System.out.println("Key " + key + " found at index " + pos);
        } else {
            System.out.println("Key " + key + " not found.");
        }
    }

    public static int binarySearch(int[] arr, int key) {
        int min = 0;
        int max = arr.length - 1;

        while (min <= max) {
            int mid = (min + max) / 2;

            if (key < arr[mid]) {
                max = mid - 1;
            } else if (key > arr[mid]) {
                min = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
