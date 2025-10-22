package labprograms;
import java.util.ArrayList;

// Course Bean class
class Course {
    private int id;
    private String name;
    private double price;

    // Constructor injection
    public Course(int id, String name, double price) throws Exception {
        this.id = id;
        this.name = name;
        setPrice(price);  // validate price
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    // Setter for price with validation
    public void setPrice(double price) throws Exception {
        if (price < 1000 || price > 3000) {
            throw new Exception("Fee must be between 1000 and 3000");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return "Course[ID=" + id + ", Name=" + name + ", Price=" + price + "]";
    }
}

// Interface for Student Course
interface StudentCourse {
    void addCourse(Course course) throws Exception;
    Course[] viewCourses() throws Exception;
    double addFee(Course course) throws Exception;
}

// Implementation class
class Semester implements StudentCourse {
    private ArrayList<Course> courseList = new ArrayList<>();

    @Override
    public void addCourse(Course course) throws Exception {
        if (course == null) throw new Exception("Cannot add null course");
        courseList.add(course);
        System.out.println("Course added: " + course);
    }

    @Override
    public Course[] viewCourses() throws Exception {
        if (courseList.isEmpty()) throw new Exception("No courses available");
        return courseList.toArray(new Course[0]);
    }

    @Override
    public double addFee(Course course) throws Exception {
        if (course == null) throw new Exception("Course not found");
        double price = course.getPrice();
        if (price > 1500) {
            double discountedPrice = price * 0.9; // 10% discount
            System.out.println("Fee after 10% discount for " + course.getName() + ": " + discountedPrice);
            return discountedPrice;
        } else {
            System.out.println("Fee without discount for " + course.getName() + ": " + price);
            return price;
        }
    }
}

// Main class
public class StudentCourseManagement {
    public static void main(String[] args) {
        try {
            Semester sem = new Semester();

            // Creating courses
            Course c1 = new Course(101, "Java", 2000);
            Course c2 = new Course(102, "Python", 1500);
            Course c3 = new Course(103, "C++", 1200);

            // Adding courses
            sem.addCourse(c1);
            sem.addCourse(c2);
            sem.addCourse(c3);

            // Viewing courses
            System.out.println("\nAll Courses:");
            for (Course c : sem.viewCourses()) {
                System.out.println(c);
            }

            // Calculating fees
            System.out.println("\nFee Details:");
            sem.addFee(c1);  // Java → discount applies
            sem.addFee(c2);  // Python → no discount
            sem.addFee(c3);  // C++ → no discount

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
