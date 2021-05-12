package SmsAuthAPI;

import java.util.Scanner;

public class SmsVerificationAPI {
	
	public boolean sendCode(String phoneNumber) {
		
		Scanner scan = new Scanner(System.in);
		String code = scan.nextLine();
		
		if (code.equals("axdgh")) {
			return true;
		}
		return false;
	}
}
