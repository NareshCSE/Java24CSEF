import java.util.Scanner;
public class duplicatearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner scanner = new Scanner(System.in);
		int size = 5;
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt(); // For integers
            // Or for strings: array[i] = scanner.next(); or scanner.nextLine();
        }
        int j,count=0;
        System.out.println("the duplicates are");
        for(int i=0;i<size;i++) {
        	for(j=i+1;j<size;j++) {
        		if(arr[i]==arr[j]) {
        			count = count+1;
        		}	
        	} if (count>=1) {
        	  System.out.println(arr[i]);
        	}count = 0;
        }
	}

}
