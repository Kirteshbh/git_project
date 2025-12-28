import java.util.Arrays;

class LinearSearch {
    public static void main(String[] args) {
        int[] arr = new int[20];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        System.out.println(Arrays.toString(arr));

        int key = 10;
        int indx = linearSearch(key, arr);

        if (indx != -1) {
            System.out.println(key + " found at index: " + indx);
        } else {
            System.out.println(key + " not found.");
        }
    }

    private static int linearSearch(int key, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
