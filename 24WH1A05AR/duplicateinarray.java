package projectsAR;

public class duplicateInArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 4, 1, 5};
        
        System.out.println("Duplicates are:");

       
           for(int i=0;i<arr.length;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}

       

