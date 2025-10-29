package add;
import java.util.Scanner;

class creditnotsufficient extends Exception{
	public creditnotsufficient(String message) {
    super(message);
	}
}
class studentservice{
	public void registerCourse(int credits) throws creditnotsufficient  {
		if(credits<50) {
			throw new creditnotsufficient("Credits are less than 50,cannot register for course");
		}
		System.out.println("Course registration successfull");
	}	
}
public class ass15 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		studentservice service=new studentservice();
		System.out.println("Enter student credits:");
		int studentcredits=scanner.nextInt();
		try {
			service.registerCourse(studentcredits);
		}catch(creditnotsufficient e) {
			System.out.println("ERROR:"+e.getMessage());
		}
		scanner.close();
	}

}
