import java.lang.Runnable;
import java.lang.Thread;

class ThreadingJava implements Runnable {
	public static void main(String[] args) {
		Thread t1 = new Thread(new ThreadingJava());
		Thread t2 = new Thread(new ThreadingJava());
		Thread t3 = new Thread(new ThreadingJava());
		t1.start();
		t2.start();
		t3.start();
	}

	public void run() {
		System.out.println("Threading class is Running...");

	}

}
