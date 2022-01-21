package w2;

public class InputArray {
    public static void printArray(int[] arr) {
        for(int n: arr)
            System.out.println(n);
    }
    
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void main(String[] args) {
        int[] values = {7, 2, 3, 4, 5, 6, 1, 8, 9};
        swap(values, 0, 6);
        printArray(values);
    }
}
