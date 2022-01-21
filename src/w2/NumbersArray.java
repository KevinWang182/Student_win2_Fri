
public class NumbersArray {

    public static void main(String[] args) {
        int[] arr = new int[100];
        
        for(int i = 0; i < arr.length;)
            arr[i] = ++i;
        
        for(int n: arr)
            System.out.println(n);
    }
    
}
