package labprograms;
import java.util.ArrayList;
import java.util.List;
class Course {
    private int id;
    private String name;
    private double price;
    public Course(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }
}
interface StudentCourse {
    void addCourse(Course course) throws Exception;
    Course[] viewCourses() throws Exception;
    void addFee() throws Exception;
}
class Semester implements StudentCourse {

    private List<Course> courseList = new ArrayList<>();

    @Override
    public void addCourse(Course course) throws Exception {
        if (course == null) {
            throw new Exception("Invalid course. Course cannot be null.");
        }
        if (course.getPrice() < 1000 || course.getPrice() > 3000) {
            throw new Exception("Course fee must be between 1000 and 3000.");
        }
        courseList.add(course);
    }

    @Override
    public Course[] viewCourses() throws Exception {
        if (courseList.isEmpty()) {
            throw new Exception("No courses available.");
        }
        return courseList.toArray(new Course[0]);
    }

    @Override
    public void addFee() throws Exception {
        if (courseList.isEmpty()) {
            throw new Exception("No courses to process fees for.");
        }

        for (Course course : courseList) {
            double originalFee = course.getPrice();
            if (originalFee > 1500) {
                double discountedFee = originalFee - (originalFee * 0.10);
                System.out.println("Course: " + course.getName() +
                    ", Original Fee: " + originalFee +
                    ", Discounted Fee: " + discountedFee);
            } else {
                System.out.println("Course: " + course.getName() +
                    ", Fee (No Discount): " + originalFee);
            }
        }
    }
}

public class exp14 {
    public static void main(String[] args) {
        try {
            StudentCourse semester = new Semester();

            semester.addCourse(new Course(101, "Java", 2000));
            semester.addCourse(new Course(102, "Python", 1500));
            semester.addCourse(new Course(103, "Data Structures", 3000));

            Course[] courses = semester.viewCourses();
            System.out.println("\n--- Course List ---");
            for (Course c : courses) {
                System.out.println("Course ID: " + c.getId() +
                                   ", Name: " + c.getName() +
                                   ", Price: " + c.getPrice());
            }

            System.out.println("\n--- Fee Details ---");
            semester.addFee();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
