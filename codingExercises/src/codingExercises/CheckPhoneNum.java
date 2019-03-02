package codingExercises;

import java.util.Scanner;

public class CheckPhoneNum {

	/*
	 * valid phone nums: 
	 *(xxx) xxx-xxxx 
	 * xxx-xxx-xxxx
	 */

	public boolean checkNum(String num) {
		String alt1 = "(xxx) xxx-xxxx";
		String alt2 = "xxx-xxx-xxxx";

		if (num.length() == alt1.length() && num.charAt(0) == '(') {
			return checkChar(num, alt1) ? true : false;
		}
		else if (num.length() == alt2.length() && num.charAt(3) == '-') {
			return checkChar(num, alt2) ? true : false;
		}

		return false;
	}
	
	public boolean checkChar(String num, String alt) {
		for (int i = 0; i < num.length(); i++) {
			if (alt.charAt(i) != 'x') {
				if (num.charAt(i) != alt.charAt(i))
					return false;
			}
		}
		return true;
	}
	

	public static void main(String[] args) {
		CheckPhoneNum main = new CheckPhoneNum();
		String phoneNum = "000-000-0000";
		Scanner in = new Scanner(System.in);
		
		while(phoneNum != "stop") {
		System.out.println("Enter phone number:");
		phoneNum = in.nextLine();
		System.out.println(main.checkNum(phoneNum));
		}
		in.close();
	}

}
