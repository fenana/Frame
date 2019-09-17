package WeekTest2;

public class Test1 extends Thread{

	public static void main(String[] args) {
		Test1 t = new Test1();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		t2.start();
		Dan dan = Dan.getinstance();
		dan.saveinfo("fenan", "123456", "10086");
	}
	public void run() {
		
		Dan.getinstance();
		
	}

}
