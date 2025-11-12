package datatypes;

public class PatternA {

	public static void main(String[] args) {
		int rows=5;
		
        for (int i = 1; i <= rows; i++) {
            // print i stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // move to next line
        }
    }
}
