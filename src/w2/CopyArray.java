package w2;

public class CopyArray {

    public static void main(String[] args) {
        /**
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arr1 = arr;
        
        arr[5] = 9;
        
        for(int i: arr1)
            System.out.println(i);
        */
        
        /**
        int[] sourceArray = {1, 2, 3, 4, 5};
        int[] targetArray = new int[sourceArray.length];
        
        for(int i = 0; i < 3; i++)
            targetArray[i] = sourceArray[i];
        
        for(int i: targetArray)
            System.out.println(i);  
        */
        
        int[] sourceArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] targetArray = new int[sourceArray.length];
        int from = 0;
        int to = 3;
        int length = 3;
        
        // for(int i = 0; i < 3; i++)
        //     targetArray[i + to] = sourceArray[i + from];
        
        System.arraycopy(sourceArray, from, targetArray, to, length);
        
        for(int n: targetArray)
            System.out.println(n); 
    }
    
}
