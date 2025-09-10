package labprograms;
import java.util.Scanner;

public class commonelements {
	public static void main(String[]args) {
	
	
	 String[] arrName= {"lahari","manasa","monisha","mahathi"};

     String[] arr2Name= {"sharanya","manasa","lahari"};

     System.out.println("Common Elements");

     for(String i:arrName) {

     	for(String j:arr2Name) {

     		if(i==j) {

     			System.out.println(i);


    		}

    	}

    }

}

}

     		






