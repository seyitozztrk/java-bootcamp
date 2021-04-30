package intro;

public class ProductManager { //urunu ilgilendiren metodlarý bu class'ýn altina getiriyoruz.
	public void addToCart(Product product) {
		System.out.println("Sepete eklemdi : " + product.getName());
	}
}
