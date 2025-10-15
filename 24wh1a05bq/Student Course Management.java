package projects;

import java.util.ArrayList;

interface StudentCourse {
    void addCourse(Course course) throws Exception;
    Course[] viewCourses() throws Exception;
    void addFee() throws Exception;
}

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
    public void setPrice(double price) { this.price = price; }

   
    public String toString() {
        return "Course ID: " + id + ", Name: " + name + ", Fee: " + price;
    }
}

class Semester implements StudentCourse {
    private ArrayList<Course> courseList = new ArrayList<>();

    public void addCourse(Course course) throws Exception {
        if (course == null)
            throw new Exception("Course cannot be null");
        courseList.add(course);
        System.out.println("Course added: " + course.getName());
    }

    public Course[] viewCourses() throws Exception {
        if (courseList.isEmpty())
            throw new Exception("No courses available");
        return courseList.toArray(new Course[0]);
    }

    public void addFee() throws Exception {
        if (courseList.isEmpty())
            throw new Exception("No courses to process fees.");

        for (Course c : courseList) {
            double fee = c.getPrice();

            if (fee < 1000 || fee > 3000) {
                System.out.println("Invalid fee range for course: " + c.getName() +
                                   ". Fee should be between 1000 and 3000.");
                continue;
            }

            if (fee > 1500) {
                double discount = fee * 0.10;
                fee -= discount;
                c.setPrice(fee);
                System.out.println("10% discount applied for " + c.getName() + ". Final Fee: " + fee);
            } else {
                System.out.println("No discount for " + c.getName() + ". Fee: " + fee);
            }
        }
    }
}

public class StudentCourseManagement {
    public static void main(String[] args) {
        try {
            Semester sem = new Semester();

            sem.addCourse(new Course(1, "Java Programming", 2000));
            sem.addCourse(new Course(2, "Python Basics", 1500));
            sem.addCourse(new Course(3, "Web Development", 3000));
            sem.addCourse(new Course(4, "Invalid Fee Course", 4000));

            sem.addFee();

            System.out.println("\nAll Courses:");
            for (Course c : sem.viewCourses()) {
                System.out.println(c);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
