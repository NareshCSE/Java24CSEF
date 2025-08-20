import java.util.Scanner;
class Simple_calculater 
{
	public static void main(String[] args) 
	{
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter first number:");
      double num1=sc.nextDouble();
      System.out.print("Enter second number:");
      double num2=sc.nextDouble();
      System.out.print("Enter operator(+,-,*,/) :");
      char operator=sc.next().charAt(0);
     
      switch (operator)
      {
         case '+' :
    	  System.out.println("The addition is: " + (num1+num2));    	  
    	  break;
    	  
         case '-' :
    	  System.out.println("The subtraction is: " + (num1-num2));
    	  break;
    	  
         case '*' :
      	  System.out.println("The multiplication is: " + (num1*num2));
      	  break; 
      	 
         case '/' :
        	 if(num2!=0)
        	 {
        	   System.out.println("The multiplication is: " + (num1/num2));
        	 }
        	 else
        	 {
        		 System.out.println("Divisible by zero is not possible");
        	 }
        	 break;
         default:
       	  System.out.print("invalid operator");	 
	   }
	} 
}