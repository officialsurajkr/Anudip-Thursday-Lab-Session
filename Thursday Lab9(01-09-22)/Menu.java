package lab_01_9_22;

public class Menu
{
	private int id;
	private String fooditem;
	private float price;
	
	public Menu(int id, String fooditem, float price) {
		super();
		this.id = id;
		this.fooditem = fooditem;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFooditem() {
		return fooditem;
	}
	public void setFooditem(String fooditem) {
		this.fooditem = fooditem;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
	
	
	
	
	
}