package interfaces;

//implement: interface'i kendini s�n�f�na uyarla demektir.
public class SmsLogger implements Logger{

	@Override
	public void log(String message) { 
		System.out.println("Sms g�nderildi.. " + message);

	}

}
