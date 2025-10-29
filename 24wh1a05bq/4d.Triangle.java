package projects;
public class triangled {
		public static void main(String[] args) {		
	        int rows = 5; // change as needed
	        for (int i = 1; i <= rows; i++) {
	                    // print leading spaces
	                    for (int j = 1; j <= rows - i; j++) {
	                        System.out.print("  "); // double space for alignment
	                    }
	                    // print increasing numbers
	                    for (int j = 1; j <= i; j++) {
	                        System.out.print(j + " ");
	                    }
	                    // print decreasing numbers
	                    for (int j = i - 1; j >= 1; j--) {
	                        System.out.print(j + " ");
	                    }
	                    System.out.println();
	                }
	            }
	        }

