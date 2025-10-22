package Java;
class CreditsNotSufficientException extends RuntimeException {
 public CreditsNotSufficientException(String msg) { super(msg);}
}
class Student {
 void checkCredits(int credits) throws CreditsNotSufficientException {
     if (credits < 50) throw new CreditsNotSufficientException("Credits less than 50!");
 }
 void registerCourse(int credits) throws CreditsNotSufficientException {
     checkCredits(credits);
     System.out.println("Course registered successfully!");
 }
}
public class creditsNotSufficient {
 public static void main(String[] args) throws CreditsNotSufficientException {
     Student s = new Student();
     s.registerCourse(40); 
 }
}


