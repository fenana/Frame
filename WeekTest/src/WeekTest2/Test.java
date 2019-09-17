package WeekTest2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Test extends Thread{
	public void run() {
		Singleton.getInstance();
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		Thread thread1 = new Thread(t);
		Thread thread2 = new Thread(t);
		Thread thread3 = new Thread(t);
		Thread thread4 = new Thread(t);
		Thread thread5 = new Thread(t);
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		Singleton t2 = Singleton.getInstance();
		t2.SaveInfo("fenan", "admin", "10.0.18.111");
		
//		Properties properties = new Properties();
//		File file = new File("src/DB.properties");
//		try {
//			InputStream inputstream = new FileInputStream(file);
//			properties.load(inputstream);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		String t1 = properties.getProperty("DBType");
//		String t2 = properties.getProperty("User");
//		String t3 = properties.getProperty("Password");
//		System.out.println(t1);
//		System.out.println(t2);
//		System.out.println(t3);
	}

}
