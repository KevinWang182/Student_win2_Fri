package w2;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Edward Eden";
        names[1] = "Adam Abbot";
        names[2] = "Derek Dexter";
        
        Arrays.sort(names);
        
        for(String n: names)
            System.out.println(n);
    }
    
}
