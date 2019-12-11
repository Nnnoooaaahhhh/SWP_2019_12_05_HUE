public class BitTooLessNumbersException extends Exception{
	
	public BitTooLessNumbersException() {
		
	}
	
	public BitTooLessNumbersException(String msg){
		super(msg);
	}
	
	public BitTooLessNumbersException(int a) {
		super("BRO DU BRAUSCH MINIMUM 8 ZOHLN");
	}

}
