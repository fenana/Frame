package WeekTest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Book> list = new <Book>ArrayList();
		Book book1 = new Book(1,"Java",66,100);
		Book book2 = new Book(2,"C++",66,100);
		Book book3 = new Book(3,"Python",66,100);
		list.add(book1);
		list.add(book2);
		list.add(book3);
		File file = new File("Book");
		try {
			OutputStream os = new FileOutputStream(file);
//			OutputStreamWriter write = new OutputStreamWriter(os, "utf-8");
			ObjectOutputStream oos = new ObjectOutputStream(os);
			
			
//			write.close();
			os.close();
			oos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
