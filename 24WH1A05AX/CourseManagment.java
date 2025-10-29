package javaprog;

interface StudentCourse{

	void addcourse(Course course) ;

	Course[] viewCourses();

	double addfee(Course course);

}

class Course{

	private int  id;

	private String name;

	private double price;

	

	

	public Course(int id,String name,double price) {

		this.id=id;

		this.name=name;

		this.price=price;

	}





	public int getId() {

		return id;

	}





	public void setId(int id) {

		this.id = id;

	}





	public String getName() {

		return name;

	}





	public void setName(String name) {

		this.name = name;

	}





	public double getPrice() {

		return price;

	}





	@Override

	public String toString() {

		// TODO Auto-generated method stub

		return ("CourseId:" +id+" course name :"+ name + " course price:"+price );

	}





	public void setPrice(double price) {

		this.price = price;

	}

	

	

}



class Semister implements StudentCourse{

	private Course[] courses;

	private int count;

	

	public Semister(int size) {

		courses=new Course[size];

		count=0;

	}



	@Override

	public void addcourse(Course course) {

		// TODO Auto-generated method stub

		if(count<courses.length) {

		courses[count++]=course;

	}

}

	



	@Override

	public Course[] viewCourses() {

		// TODO Auto-generated method stub

		return courses;

	}



	@Override

	public double addfee(Course course) {

		// TODO Auto-generated method stub

		double totalfee=0;

		for(Course c:courses) {

			double price=c.getPrice();

			if(price>=1500) {

				price=price-price*0.01;

			}

			totalfee+=price;

		}

		System.out.println("totalfee="+totalfee);

		return totalfee;

	}



	

	

}

public class CourseManagement14 {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Semister s=new Semister(3);

		Course course1=new Course(1,"chandana",4000);

		Course course2=new Course(2,"Bhavana",2000);

		Course course3=new Course(2,"Hamsa",9000);		

		s.addcourse(course1);

		s.addcourse(course2);
		
		s.addcourse(course3);

		System.out.println("course information: ");

		for(Course c:s.viewCourses()) {

			System.out.println(c);
			

		}
		double fee=s.addfee(null);

	

        

	}



}
