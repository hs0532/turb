package test2;

public class Flower {
	private String name;
	private int price;
	public Flower(){
		
	}
	public Flower(String name,int price){
		this.name = name;
		this.price = price;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public Flower reaisePrice() {
		this.price += 10;
		return this;

	}

	public String toString() {
		
		return "种类："+name+"\n价格："+price;
	}

}
