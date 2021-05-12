package GoogleAuth;

import java.util.Scanner;

public class GoogleVerificationAPI {
	
	public boolean sendVerificationCode(String email) {
		
		System.out.println("merhaba " + email + " isimli e-postaya sahip kiþilik. "
				  	 + "	\nBu eposta ile XYZ isimli sistemimize kayýt baþvurunuz bulunmaktadýr. "
					 + " \n Bu mesaja küçük harfler ile 'dogruluyorum' yazarsanýz üyelik iþleminiz tamamlanacaktýr. "
					 + " \n Deðerli vaktinizi ayýrdýðýnýz için teþekkürler... 11.05.2021 "
					 + "\n buraya yaziniz : ");
		
		Scanner scan = new Scanner(System.in);
		
		String dogrulama = scan.nextLine();
		System.out.println(dogrulama);
		if(dogrulama.equals("dogruluyorum")) {
			return true;
		}
		return false;
		
	}

}
