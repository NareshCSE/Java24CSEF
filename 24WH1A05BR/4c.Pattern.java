package datatypes;

public class PatternC {

	public static void main(String[] args) {

        int rows = 5; // change as needed

        // upper pyramid
        for (int i = 1; i <= rows; i++) {
            // spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            // increasing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // decreasing stars
            for (int j = i - 1; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // lower inverted pyramid
        for (int i = rows - 1; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            // increasing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // decreasing stars
            for (int j = i - 1; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
