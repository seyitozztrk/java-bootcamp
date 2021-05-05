package homework4_1;
//abstract class: zorunlu operasyonlar ekleyebiliyoruz...
public abstract class GameCalculator {
	//hesapla isimli bir imzad�r. Inherit eden ki�iler bu fonksiyonu override ederek kullanmak zorundad�r.
	public abstract void hesapla();
	
	
	//bu s�n�f� kullanan herkes kesinlikle final olarak tan�mlad���m�z fonksiyonu kullanmak zorundad�r.
	public final void gameOver() { 
		System.out.println("Oyun bitti..");
	}
}
