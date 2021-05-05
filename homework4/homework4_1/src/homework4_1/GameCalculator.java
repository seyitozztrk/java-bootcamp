package homework4_1;
//abstract class: zorunlu operasyonlar ekleyebiliyoruz...
public abstract class GameCalculator {
	//hesapla isimli bir imzadýr. Inherit eden kiþiler bu fonksiyonu override ederek kullanmak zorundadýr.
	public abstract void hesapla();
	
	
	//bu sýnýfý kullanan herkes kesinlikle final olarak tanýmladýðýmýz fonksiyonu kullanmak zorundadýr.
	public final void gameOver() { 
		System.out.println("Oyun bitti..");
	}
}
