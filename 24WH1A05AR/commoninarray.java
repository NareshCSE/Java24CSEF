package projectsAR;

class commonIn2Arrays {
        public static void main(String[] args) {
   
        int array1[]= {6,2,3,4},array2[]= {4,5,6,7};
        
        System.out.println("Common elements are:");
        
        for(int i=0;i<array1.length;i++) {
        	for(int j=0;j<array2.length;j++) {
        		if(array1[i]==array2[j]) {
        			System.out.println(array1[i]);
        		}
        	}
        }
        	
}
}
 

    
