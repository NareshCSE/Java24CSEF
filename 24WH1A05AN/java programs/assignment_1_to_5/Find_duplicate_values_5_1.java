package assignment_1_to_5;
class Find_duplicate_values_5_1 
{
  public static void main(String[] args)
  {
	  int[] arr= {1,3,5,2,7,1,9,5,7,1,8};
	  System.out.println("Duplicate values are: ");
	  
	  for(int i=0;i<arr.length;i++)
	  {
		  for(int j=i+1;j<arr.length;j++)
		  {
			  if(arr[i]==arr[j])
			  {
				  boolean alreadyPrinted = false;
				  for(int k=0;k<i;k++)
				  {
					 if(arr[k]==arr[i])
					 {
					  alreadyPrinted= true;
					  break;
					 }
				  }
				  if(!alreadyPrinted)
				  {
					  System.out.print(arr[i] +" ");
				  }
				  break;
			  }
		  }
	  }
  }
}
