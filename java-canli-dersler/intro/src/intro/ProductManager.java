package intro;

public class ProductManager { //urunu ilgilendiren metodlar� bu class'�n altina getiriyoruz.
	public void addToCart(Product product) {
		System.out.println("Sepete eklemdi : " + product.getName());
	}
}
