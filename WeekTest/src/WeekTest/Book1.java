package WeekTest;

import java.io.Serializable;

public class Book1 implements Serializable{
	private int bookId;
	private String bookName;
	private int bookPrice;
	private int bookSum;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public int getBookSum() {
		return bookSum;
	}
	public void setBookSum(int bookSum) {
		this.bookSum = bookSum;
	}
	@Override
	public String toString() {
		return "Book1 [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + ", bookSum="
				+ bookSum + "]";
	}
	public Book1(int bookId, String bookName, int bookPrice, int bookSum) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookSum = bookSum;
	}
	public Book1() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
