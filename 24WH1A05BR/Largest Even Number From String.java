package datatypes;

public class LargestEvenFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stubpublic class LargestEvenFromString {
	  	        String input = "ad%#2373#@";  // Example input

	        boolean[] digitSeen = new boolean[10];

	        // Step 1: Extract digits
	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);
	            if (ch >= '0' && ch <= '9') {
	                digitSeen[ch - '0'] = true;
	            }
	        }

	        // Step 2: Build largest number
	        StringBuilder number = new StringBuilder();
	        int lastEven = -1;

	        for (int d = 9; d >= 0; d--) {
	            if (digitSeen[d]) {
	                if (d % 2 == 0) {
	                    // save the smallest even for the end
	                    if (lastEven == -1 || d < lastEven) {
	                        if (lastEven != -1) number.append(lastEven);
	                        lastEven = d;
	                    } else {
	                        number.append(d);
	                    }
	                } else {
	                    number.append(d);
	                }
	            }
	        }

	        // Step 3: Check if we got any even digit
	        if (lastEven == -1) {
	            System.out.println(-1);
	        } else {
	            number.append(lastEven);
	            System.out.println(number.toString());
	        }
	    }
	


	}


