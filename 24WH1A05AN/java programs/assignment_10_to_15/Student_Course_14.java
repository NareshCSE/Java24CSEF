package assignment_10_to_15;
import java.util.ArrayList;
import java.util.List;

class Course {
    private int id;
    private String name;
    private double price;

    // Constructor Injection
    public Course(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    // Setters (optional)
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }
}

interface StudentCourse {
    void addCourse(Course course) throws Exception;
    Course[] viewCourses() throws Exception;
    double addFee() throws Exception;
}

class Semester implements StudentCourse {
    private List<Course> courses = new ArrayList<>();

    @Override
    public void addCourse(Course course) throws Exception {
        if (course == null) {
            throw new Exception("Course cannot be null");
        }
        if (course.getPrice() < 1000 || course.getPrice() > 3000) {
            throw new Exception("Course fee must be between 1000 and 3000");
        }
        courses.add(course);
    }

    @Override
    public Course[] viewCourses() throws Exception {
        if (courses.isEmpty()) {
            throw new Exception("No courses added yet");
        }
        return courses.toArray(new Course[0]);
    }

    @Override
    public double addFee() throws Exception {
        if (courses.isEmpty()) {
            throw new Exception("No courses added to calculate fee");
        }

        double totalFee = 0;
        for (Course c : courses) {
            double price = c.getPrice();
            if (price > 1500) {
                price = price * 0.9; // 10% discount
            }
            totalFee += price;
        }
        return totalFee;
    }
}

public class Student_Course_14 {
    public static void main(String[] args) {
        try {
            Semester semester = new Semester();

            semester.addCourse(new Course(1, "Java Programming", 1800));
            semester.addCourse(new Course(2, "Database Systems", 1400));
            semester.addCourse(new Course(3, "Web Development", 2500));

            System.out.println("Courses enrolled:");
            for (Course c : semester.viewCourses()) {
                System.out.println(c.getId() + " - " + c.getName() + " : ₹" + c.getPrice());
            }

            double totalFee = semester.addFee();
            System.out.println("Total fee after discount (if any): ₹" + totalFee);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
