package cse05aq;

public class commonelementsinarray5c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String[ ] arr1= {"apple","b","dog","monkey"};
      String[ ] arr2= {"d","dog","hi","bye"};
      
     for(int i=0; i<arr1.length; i++) {
    	 for(int j=0;j<arr2.length; j++) {
    		 if(arr1[i].equals(arr2[j])) {
    			 System.out.println(arr1[i]+ "  ");
    			 break;
    		 }
    	 }
     }
	}
}
