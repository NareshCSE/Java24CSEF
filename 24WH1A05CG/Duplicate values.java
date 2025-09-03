package sahasra;

import java.util.HashSet;
import java.util.Set;

public class Duplicate_values {
    public static Set<Integer> findDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) {  
                duplicates.add(num);
            }
        }
        return duplicates;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 5, 6};
        Set<Integer> duplicates = findDuplicates(arr);
        System.out.println("Duplicates: " + duplicates); 
    }
}
