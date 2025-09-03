public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {20,30,60,20,50,20,30,20};
        int i,j;
       
		for(i=0;i<arr.length;i++) {
			int count=0;
			for(j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j] && arr[i]!=-1) {
					count++;
					arr[j]=-1;
				}
			}
			if(count>=1) {
				System.out.println(arr[i]);
			}
		}
        
    
	

	}
}
