import java.util.ArrayList;
import java.util.List;

/*
 * Finds Narcisstic numbers over a range
 * 
 * http://mathworld.wolfram.com/NarcissisticNumber.html
 * 
 * @author Puneet
 */
public class NarcissticNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int min = 0;
		int max = 500;
		for(int i = min; i<= max;i++){
			if(isNarcissistic(i)){
				System.out.println("Is Is Is Is Narcisstic "+ i);
			}
		}
	}

	
	private static boolean isNarcissistic(int i){
		List digits = listtOfDigits(i);
//		printDigits(digits);
		double cube = cubeOfDigits(digits);
		
		if(cube == i){
			return true;
		}
		
		return false;
	}

	private static double cubeOfDigits(List digits) {
		double cube = 0;
		int sz = digits.size();
		for(int i = 0; i< digits.size(); i++){
			cube = (cube + Math.pow((Integer)digits.get(i), sz));
		}
		
		return cube;
	}


	private static void printDigits(List digits){
		System.out.println(digits.toString());
	}
	
	private static List listtOfDigits(int i) {
		List digits = new ArrayList();
		int rem = 0;
		while(i/10 >0){
			rem = i % 10;
			digits.add(rem);
			i = i/10;
		}
		rem = i;
		digits.add(rem);
		
		return digits;
	}	
}
