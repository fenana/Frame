package WeekTest2;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Singleton {
	private static Singleton instance ;
	private Singleton() {
		
	}
	public static synchronized Singleton getInstance() {
		
		if(instance == null) {
			try {
				Thread.sleep(1000);
				instance = new Singleton();
				System.out.println(instance);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return instance;
		
	}
	public void SaveInfo(String dbName,String dbPwd,String dbIp) {
		Properties properties = new Properties();
		properties.setProperty(dbName, "dbName");
		properties.setProperty(dbPwd, "dbPwd");
		properties.setProperty(dbName, "dbName");
		try {
		OutputStream out = new FileOutputStream("DB.properties");
		properties.store(out, "Fenan");
		System.out.println("保存成功");
		}catch (Exception e) {
			System.out.println("保存失败");
		}
	}
	
//	public void login() {
//		System.out.println("连接数据库");
//	}
//	public void clelectJDBC() {
//		System.out.println("登录");
//	}

}
