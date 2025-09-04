public class Trianglepattern4c {

	public static void main(String[] args) {
		int n = 9;
		for (int i = 0; i < n; i++)
   {
			for (int j = 0; j < n; j++)
      {
				if (i > (n - 1) / 2) 
         {
					if (j >= ((n - 1) / 2) - (n - 1 - i) && j <= ((n - 1) / 2) + (n - 1 - i))
          {
						System.out.print("*");
					} 
          else {
						System.out.print(" ");
					}
				} 
        else
         {
					if (j >= ((n - 1) / 2) - i && j <= ((n - 1) / 2) + i)
         {
						System.out.print("*");

					} 
        else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}

	}

}
