package onlineshoppingproject.onlineshoppingapp;

public class Product {
	
	private String product_name;
	private double price;
	private int quality_in;
	private String imagelocation;
	
	
	
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuality_in() {
		return quality_in;
	}
	public void setQuality_in(int quality_in) {
		this.quality_in = quality_in;
	}
	public String getImagelocation() {
		return imagelocation;
	}
	public void setImagelocation(String imagelocation) {
		this.imagelocation = imagelocation;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String product_name, double price, int quality_in, String imagelocation) {
		super();
		this.product_name = product_name;
		this.price = price;
		this.quality_in = quality_in;
		this.imagelocation = imagelocation;
	}

	
	
}
