package javalab;
class creditsNotSufficientException extends RuntimeException{
	public creditsNotSufficientException(int credits) {
		super();
	}
	
}
class ValidateCredits{
	public void ValidateCredits(int credits)throws creditsNotSufficientException{
		if(credits<50)
		{ throw new creditsNotSufficientException(credits);
			
		}
		
		
	}
}


class credits {

	public static void main(String[] args) {
            int credits=39;
            ValidateCredits service=new ValidateCredits();
            try {
            	service.ValidateCredits(credits);
            }catch(creditsNotSufficientException e) {
            	e.printStackTrace();
            	System.out.println("Credits insufficient");
            }

	}

}
