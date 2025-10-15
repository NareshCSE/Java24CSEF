package studentCourseManagement;

public class Course {
    private int courseId;
    private String courseName;
    private double coursePrice;

    public Course(int courseId, String courseName, double coursePrice) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.coursePrice = coursePrice;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public double getCoursePrice() {
        return coursePrice;
    }

    @Override
    public String toString() {
        return "Course ID: " + courseId + ", Name: " + courseName + ", Price: " + coursePrice;
    }
}
