package javaprograms;

public class patternD {
    public static void main(String[] args) {
        int n = 5; 

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            for (int k = i - 1; k >= 1; k--) {
                System.out.print(k + " ");
            }

            System.out.println();
        }
    }
}

         

           
    
