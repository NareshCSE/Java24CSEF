package java2;

public class array1 {

	public static void main(String[] args) {
		int i,j;
		int[] numbers= {1,2,3,4,5,2};
		for(i=0;i<numbers.length;i++)
		{
			for(j=i+1;j<numbers.length;j++)
			{
				if(numbers[i]==numbers[j]) 
				{
					System.out.println(numbers[i]);
				}
			}
		}

}
}
