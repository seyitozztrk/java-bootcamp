package intro;
//DONT REPEAT YOURSELF
public class Product {
	//this : bu class'taki nesne demektir.
	//final : sadece contructor'da set edilebilir.
	
	//encapsulation 
	private int id;
	private String name;
	private double unitPrice;
	private String detail;
	private double discount; 
	private double unitPriceAfterDiscount; 
	
	public Product() {
			
	}
	
	
	public Product(int id, String name, double unitPrice, String detail, double discount, double unitPriceAfterDiscount) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.discount = discount;
		this.unitPriceAfterDiscount = unitPriceAfterDiscount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getUnitPriceAfterDiscount() {
		return this.unitPrice - (this.unitPrice * this.discount / 100);
	}
	
}

//SOLID PRENSIBI

/*S -> Her metod sadece bir isi yapmak ile y�k�ml�d�r.
 * class'lar ikiye ayr�l�r
 * �zellik tutucu class
 * metod tutucu class
 * 
 * 
 * */
