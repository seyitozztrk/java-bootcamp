package GoogleAuth;

import java.util.Scanner;

public class GoogleVerificationAPI {
	
	public boolean sendVerificationCode(String email) {
		
		System.out.println("merhaba " + email + " isimli e-postaya sahip ki�ilik. "
				  	 + "	\nBu eposta ile XYZ isimli sistemimize kay�t ba�vurunuz bulunmaktad�r. "
					 + " \n Bu mesaja k���k harfler ile 'dogruluyorum' yazarsan�z �yelik i�leminiz tamamlanacakt�r. "
					 + " \n De�erli vaktinizi ay�rd���n�z i�in te�ekk�rler... 11.05.2021 "
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
