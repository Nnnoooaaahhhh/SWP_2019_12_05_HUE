import java.util.*;

public class TestMain {

	static int b = 0;
	static String Number;
	static int minimal = 8;
	static char uno = '1';
	static char dos = '0';
	static int result = 0;	
	
	public static void main(String[] args) {
	
	try {
		Scanner a = new Scanner(System.in);
		Number = a.next();
		b = Number.length();
		for (int i = 0; i < b; i++) {
			if(Number.charAt(i)!=dos){
				if(Number.charAt(i)!=uno) {
					throw new WrongFormatException(uno, dos);	
				}
			}
		}
		if(b < minimal) {
			throw new BitTooLessNumbersException(minimal);
				}
		System.out.println(toDecimal(Number));
		}
	catch(BitTooLessNumbersException e) {
		e.printStackTrace();
	} 
	catch (WrongFormatException f) {
		f.printStackTrace();
		}
	}
	
	static int toDecimal(String Number) {
		int counter = 0;
		int temp1;
		int temp2;
		String NumberTest;
		
		NumberTest = new StringBuilder(Number).reverse().toString();
		
		for (int i = 0; i < Number.length(); i++) {
				
			    temp2 = Integer.valueOf(NumberTest.charAt(i)-48);
				temp1 =  (int) ((int) temp2*Math.pow(2, counter));
				result = result + temp1;		
				counter++;
		}		
		return result;
	}
}
