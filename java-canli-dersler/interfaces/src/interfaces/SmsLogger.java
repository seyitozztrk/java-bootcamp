package interfaces;

//implement: interface'i kendini sýnýfýna uyarla demektir.
public class SmsLogger implements Logger{

	@Override
	public void log(String message) { 
		System.out.println("Sms gönderildi.. " + message);

	}

}
