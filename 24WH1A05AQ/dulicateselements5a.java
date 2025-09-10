package cse05aq;

public class dulicateselements5a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int[] numbers = {1, 2, 3, 4, 2, 5, 6, 3, 7, 1};

		        for (int i = 0; i < numbers.length; i++) {
		            System.out.print(numbers[i] + " ");
		        }
		        System.out.println();

		        for (int i = 0; i < numbers.length; i++) {
		            for (int j = i + 1; j < numbers.length; j++) {
		                if (numbers[i] == numbers[j]) {
		                    System.out.println(numbers[i]);
		                   
		                }
		            }
		        }
		    }
		}

	


