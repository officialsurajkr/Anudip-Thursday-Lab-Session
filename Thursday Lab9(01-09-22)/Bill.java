package lab_01_9_22;

public class Bill 
{
	private String fooditem;
	private int qnt; //quantity
	private double price;
	public String getFooditem() {
		return fooditem;
	}
	public void setFooditem(String fooditem) {
		this.fooditem = fooditem;
	}
	public int getQnt() {
		return qnt;
	}
	public void setQnt(int qnt) {
		this.qnt = qnt;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Bill(String fooditem, int qnt, double price) {
		super();
		this.fooditem = fooditem;
		this.qnt = qnt;
		this.price = price;
	}
	 
	 
	
	
	
	
}
