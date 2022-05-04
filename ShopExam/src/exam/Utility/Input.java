package exam.Utility;

import java.math.BigDecimal;
import java.util.Scanner;

public class Input {
	
	public static int inputInt( Scanner in, String message) {
		int i=0;
		while(true) {
			System.out.print(message + ": ");
			i = Integer.parseInt(in.nextLine());
			if(i<1) {
				System.out.println("Number must be positive!");
				continue;
			}
			return i;
		}
	}
	public static Long inputLong( Scanner in, String message) {
		Long i;
		while(true) {
			System.out.print(message + ": ");
			i = Long.parseLong(in.nextLine());
			if(i<1) {
				System.out.println("Number must be positive!");
				continue;
			}
			return i;
		}
	}
	public static BigDecimal inputBigDecimal(Scanner in,String message) {
		BigDecimal i=BigDecimal.ZERO;
		while(true) {
			System.out.print(message + ": ");
			i = new BigDecimal(in.nextLine());
			if(i.compareTo(BigDecimal.ONE) < 0) {
				System.out.println("Number must be positive!");
				continue;
			}
			return i;
		}
	}
	public static String inputString(Scanner in, String message) {
		String s="";
		while(true) {
			System.out.print(message + ": ");
			s = in.nextLine();
			if(s.length()==0) {
				System.out.println("Please input a word!");
				continue;
			}
			return s;
		}
	}

}
