package javaPrograms;

class Course{
	int courseId;
	String courseName;
	double price;
	Course(int id, String name, double p){
		this.courseId = id;
		this.courseName = name;
		this.price = p;
	}
}
public interface StudentCourse {
	void addCourse(Course c) throws Exception;
	Course[] viewCourses() throws Exception;
	double addFee(double fee);
}



package javaPrograms;

public class Semester implements StudentCourse{
	Course[] courses = new Course[10];
	int count = 0;
	@Override
	public void addCourse(Course c) {
		try{
			courses[count++] = c;
		}catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("Courses limit exceeded");
		}
	}

	@Override
	public Course[] viewCourses() {
		try {
			return courses;
		}catch(NullPointerException e) {
			System.out.println("There are no courses available.");
		}
		return courses;	
	}

	@Override
	public double addFee(double fee) {
		double finalFee = fee;
	    if (fee > 1500) {
	        finalFee -= (fee * 0.10);
	    }
	    return finalFee;	
	}
	
	public static void main(String[] args) {
		Semester s = new Semester();
		s.addCourse(new Course(101, "JAVA", 1700));
		s.addCourse(new Course(103, "DBMS", 1300));
		s.addCourse(new Course(105, "DSM", 1600));
		Course[] courses = s.viewCourses();
        for (Course c : courses) {
        	if(c != null) {
	        	System.out.println("Course ID: " + c.courseId);
	        	System.out.println("Course Name: " + c.courseName);
	        	System.out.println("Price: Rs." + c.price);
	        	System.out.println("Final Fee: Rs." + s.addFee(c.price));
	        	System.out.println();
        	}
        }

	}
}
