package interfaceDemo;

class Course{
	private int id;
	private String name;
	private double price;
	Course(int id, String name, double price){
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
}

public interface StudentCourse{
	void addCourse(Course courseToAdd) throws Exception;
	Course[] viewCourses() throws Exception;
	double addFee(int[] courseIds) throws Exception;
}
