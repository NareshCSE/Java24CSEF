package demo;
import java.util.*;
public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner num= new Scanner(System.in);
				System.out.print("Enter n1 value: ");
				
				int n1= num.nextInt();
				System.out.print("Enter n2 value: ");
				int n2= num.nextInt();
				System.out.print("Enter operation: ");
				int oper=num.nextInt();
				System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.Division");
				System.out.println("Result is:");
				switch(oper) {
				    case 1 : 
				    	System.out.println(n1+n2);
				    	break;
				    case 2 :
				    	System.out.println(n1-n2);
				    	break;
				    case 3 :
				    	System.out.println(n1*n2);
				    	break;
				    case 4 :
				    	System.out.println(n1/n2);
				    	break;
				    default :
				    	System.out.println("invalid operation");
				}
				

			}

		}


	
