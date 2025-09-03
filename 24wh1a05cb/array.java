package patternc;

public class Array1 {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,2,3};
		System.out.println("The Duplicate elemenets in the array are:");
		int i,j;
		for(i=0;i<arr.length;i++) {
			for(j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
					break;
				}
			}
		}
	}

}
