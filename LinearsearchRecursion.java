import java.util.Arrays;

class LinearsearchRecursiom {
    public static void main(String[] args) {
        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++)
            arr[i] = i + 1;

        System.out.println(Arrays.toString(arr));

        int key = 10;

        int indx = isLinearSearchRecursive(key, arr, 0);

        if (indx != -1) {
            System.out.println(key + " found at index: " + indx);
        } else {
            System.out.println(key + " not found in array");
        }
    }

    private static int isLinearSearchRecursive(int key, int[] arr, int index) {
        if (index >= arr.length) {
            return -1;
        }
        if (arr[index] == key) {
            return index;
        }
        
        return isLinearSearchRecursive(key, arr, index + 1);
    }
}
