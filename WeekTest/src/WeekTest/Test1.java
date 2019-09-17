package WeekTest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		
		List<Book> list = new <Book>ArrayList() ;
		list.add(new Book(1,"Java",100,100));
		list.add(new Book(2,"Python",100,100));
		list.add(new Book(3,"Web",100,100));
		list.add(new Book(4,"C",100,100));
		
		try {
			File file = new File("books");
			OutputStream os = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(os);
			
			oos.writeObject(list);
			os.close();
			oos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
