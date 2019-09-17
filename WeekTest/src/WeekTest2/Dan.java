package WeekTest2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Dan {
	private Dan() {}
	private static Dan instance;
	public static synchronized Dan getinstance() {
		if(instance ==null) {
			try {
				Thread.sleep(1000);
				instance = new Dan();
				System.out.println("我是一个单例对象");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return instance;
	}
	public void  saveinfo(String name,String password,String ip) {
		Properties properties = new Properties();
		properties.setProperty("姓名", name);
		properties.setProperty("密码", password);
		properties.setProperty("ip", ip);
		try {
			OutputStream os = new FileOutputStream("DB.preperties");
			properties.store(os, "Fenan");
			System.out.println("存储成功");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
