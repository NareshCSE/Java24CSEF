
public class matrixmultiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] mat1 = {{1,1,1},{1,1,1}};
        int[][] mat2 = {{1,1,1},{1,1,1}};
        int row1 = mat1.length;
        int col1 = mat1[0].length;
        int row2 = mat2.length;
        int col2 = mat2[0].length;
        int mat3[][] = new int[row1][col2];
        int i,j,k;
        for(i=0;i<row1;i++) {
        	for(j=0;j<col2;j++) {
        		for(k=0;k<row2;k++) {
        			mat3[i][j] = mat1[i][k] + mat2[k][j];
        		}
        	}
        }
        // Print result
        System.out.println("Result of Matrix Multiplication:");
        for ( i = 0; i < row1; i++) {
            for(j = 0; j < col2; j++) {
                System.out.print(mat3[i][j] + " ");
            }
            System.out.println();
        }
	}

}
