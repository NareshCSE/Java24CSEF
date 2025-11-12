package datatypes;

public class PatternB {

	public static void main(String[] args) {
        int rows = 5;  // change as you like

        for (int i = 1; i <= rows; i++) {
            // print spaces first
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  "); // two spaces for alignment
            }
            // then print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
