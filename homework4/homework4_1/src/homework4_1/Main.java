package homework4_1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
		
		GameCalculator gameCalculator = new OlderGameCalculator();
		gameCalculator.hesapla();
		gameCalculator.gameOver();
	}

}
