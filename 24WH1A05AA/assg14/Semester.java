package studentCourseManagement;

public class Semester implements StudentCourse {

    private Course[] courses;
    private int courseCount;

    public Semester(int maxCourses) {
        courses = new Course[maxCourses];
        courseCount = 0;
    }

    @Override
    public void addCourse(Course course) throws Exception {
        if (courseCount < courses.length) {
            courses[courseCount++] = course;
            System.out.println("Course added: " + course.getCourseName());
        } else {
            throw new Exception("Course limit reached. Cannot add more courses.");
        }
    }

    @Override
    public Course[] viewCourses() throws Exception {
        if (courseCount == 0) {
            throw new Exception("No courses available.");
        }
        Course[] currentCourses = new Course[courseCount];
        for (int i = 0; i < courseCount; i++) {
            currentCourses[i] = courses[i];
        }
        return currentCourses;
    }

    @Override
    public double addFee() throws Exception {
        if (courseCount == 0) {
            throw new Exception("No courses available to calculate fee.");
        }

        double totalFee = 0;
        for (Course course : courses) {
            if (course != null) {
                double courseFee = course.getCoursePrice();
                if (courseFee > 1500) {
                    courseFee -= courseFee * 0.10; // 10% discount
                }
                totalFee += courseFee;
            }
        }
        return totalFee;
    }
}
