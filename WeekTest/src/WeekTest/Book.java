package WeekTest;

import java.io.Serializable;

public class Book implements Serializable{
	private int id;
	private String name;
	private int price;
	private int sum;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int id, String name, int price, int sum) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.sum = sum;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", sum=" + sum + "]";
	}
	

}
