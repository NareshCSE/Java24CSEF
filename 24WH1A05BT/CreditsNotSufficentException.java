package javaPrograms;
class CreditsNotSufficient extends RuntimeException{
	public CreditsNotSufficient(String s) {
		super(s);
	}
}
public class Credits {
	public void checkCredits(int credit){
		if(credit < 50) {
			throw new CreditsNotSufficient("Credits are insufficient");
		}
	}
	public static void main(String[] args) {
		Credits c = new Credits();
		c.checkCredits(40);
	}
}
