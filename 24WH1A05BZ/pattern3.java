package java2;

public class pattern3 {

public static void main(String[] args) {
int row=5;
     for(int i=1;i<=5;i++) 
     {
        for(int j=1;j<=row-i;j++) 
        {
            System.out.print("_");
        }
        for(int k=1;k<=(2*i)-1;k++)
        {
           System.out.print("*");
        }
    System.out.println(" ");

     }
    for(int m=4;m>=1;m--) 
    {
       for(int j=1;j<=(row-m);j++) 
       {
           System.out.print("_");
       }
       for(int k=1;k<=(2*m)-1;k++)
       {
           System.out.print("*");
       }
     System.out.println(" ");
     }
}

}
