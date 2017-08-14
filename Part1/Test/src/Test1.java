public class Test1  implements Runnable {
	
	@Override
	public  void run() {
		Thread.yield();
		for(int i = 0; i <= 10; i++) {
			System.out.println("child thread = "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		
		//Test1 t = new Test1();
		Thread t = new Thread(new Test1());
		t.setPriority(5);
		t.start();
		t.interrupt();
		
	
		for(int i = 0; i <= 10; i++) {
			System.out.println("main thread = "+i);
			
		}
	}
}
