package assignment_1_to_5;
public class Common_elements_5_3 
{
    public static void main(String[] args) 
    {
        String[] Basket1 = {"apple", "banana", "cherry", "mango"};
        String[] Basket2 = {"grapes", "banana", "mango", "orange"};
        System.out.println("Common elements between the two Baskets: ");
        for (int i = 0; i < Basket1.length; i++) 
        {
            for (int j = 0; j < Basket2.length; j++) 
            {
                if (Basket1[i]==(Basket2[j])) 
                {   
                    System.out.println(Basket1[i]);
                }
            }
        }
    }
}