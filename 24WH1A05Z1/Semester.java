package interfaceDemo;
import java.util.Scanner;

public class Semester implements StudentCourse{
	private Course[] courses = new Course[10];
	private int courseCount = 0;
	@Override
	public void addCourse(Course courseToAdd) throws Exception{
		try {
			if(courseCount<courses.length)
					courses[courseCount++] = courseToAdd;
			else
					System.out.println("Courses are full");
		}catch(Exception e) {
			System.out.println("Error while adding course:");
			e.printStackTrace();
		}
	}

	@Override
	public Course[] viewCourses() throws Exception{
		// TODO Auto-generated method stub
		Course[] result = new Course[courseCount];
		try {
			for(int i=0; i<courseCount;i++) {
				result[i] = courses[i];
			}
		}catch(Exception e) {
			System.out.println("Error while viewing course:");
			e.printStackTrace();
		}
		return result;
		
	}

	@Override
	public double addFee(int[] courseIds) throws Exception{
		double totalFee = 0;
		try {
			for(int id: courseIds) {
				for(int i = 0; i < courseCount ; i++) {
					if(id == courses[i].getId()) {
						double fee = courses[i].getPrice();
						if(fee> 1500) 
							fee -= fee*0.1;
						totalFee += fee;
					}
				}
			}
		}catch(Exception e) {
			System.out.println("Error while adding fee:");
			e.printStackTrace();
		}
		return totalFee;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Semester sem = new Semester();

        try {
            sem.addCourse(new Course(1, "Java Programming", 2000));
            sem.addCourse(new Course(2, "Data Structures", 1500));
            sem.addCourse(new Course(3, "Web Development", 2500));
            sem.addCourse(new Course(4, "Database Systems", 1200));

            int choice;
            do {
                System.out.println("\nSTUDENT COURSE MANAGEMENT: ");
                System.out.println("1. View Courses");
                System.out.println("2. Adding Courses");
                System.out.println("3. Calculate Total Fee");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        Course[] list = sem.viewCourses();
                        System.out.println("\nAvailable Courses:");
                        for (Course c : list)
                            System.out.println(c.getId() + ". " + c.getName() + " - " + c.getPrice());
                        break;

                    case 2:
                    	System.out.print("Enter Course ID: ");
                        int id = sc.nextInt();
                        sc.nextLine(); 
                        System.out.print("Enter Course Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Course Fee (1000 - 3000): ");
                        double fee = sc.nextDouble();

                        Course newCourse = new Course(id, name, fee);
                        sem.addCourse(newCourse);
                        System.out.println("Course added successfully!");
                        break;

                    case 3:
                        System.out.print("Enter number of courses to calculate total fee: ");
                        int count = sc.nextInt();
                        int[] courseIds = new int[count];
                        System.out.println("Enter Course IDs:");
                        for (int i = 0; i < count; i++)
                            courseIds[i] = sc.nextInt();
                        double total = sem.addFee(courseIds);
                        System.out.println("Total Fee: " + total);
                        break;

                    case 4:
                        System.out.println("Thank you for using Student Course Management System!");
                        break;

                    default:
                        System.out.println("Invalid choice! Try again.");
                }

            } while (choice != 4);

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } 
        sc.close();
	}
}
