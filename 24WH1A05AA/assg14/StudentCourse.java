package studentCourseManagement;

public interface StudentCourse {
    void addCourse(Course course) throws Exception;   
    Course[] viewCourses() throws Exception;          
    double addFee() throws Exception;                 
}
