package core.concretes;

import java.util.Scanner;

import SmsAuthAPI.SmsVerificationAPI;
import core.abstracts.IVerificationService;

public class SmsVerification implements IVerificationService {

	@Override
	public boolean sendVerificationCode(String phoneNumber) {
		
		SmsVerificationAPI smsVerification = new SmsVerificationAPI();
		
		
		// TODO Auto-generated method stub
		System.out.println(phoneNumber + " numarasýna doðrulama kodu gönderilmiþtir. \n(code : axdgh )"
				+ "Lütfen kodu giriniz : ");
		
		return smsVerification.sendCode(phoneNumber);
	}

}
