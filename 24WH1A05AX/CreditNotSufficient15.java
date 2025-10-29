package javaprog;
class CreditsNotSufficientException extends RuntimeException{
	CreditsNotSufficientException(String message) {
		super(message);
	}
}

public class exception15 {
	static void checkCredits(int credits) throws CreditsNotSufficientException{
		if(credits<50) {
			throw new CreditsNotSufficientException("Credits not sufficient!");
		}else {
			System.out.println("Credits sufficient"+credits);
		}
	}

	public static void main(String[] args) throws CreditsNotSufficientException {
		// TODO Auto-generated method stub
		checkCredits(70);
		checkCredits(40);
		

	}

}
