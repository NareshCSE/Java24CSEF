package studentCourseManagement;

public class Main {
    public static void main(String[] args) {
        try {
            Semester semester = new Semester(5);
            Course c1 = new Course(1, "Java Programming", 2000);
            Course c2 = new Course(2, "Python Programming", 1200);

            semester.addCourse(c1);
            semester.addCourse(c2);

            System.out.println("\n--- Courses ---");
            for (Course c : semester.viewCourses()) {
                System.out.println(c);
            }
            System.out.println("\n--- Total Semester Fee ---");
            System.out.println(semester.addFee());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
