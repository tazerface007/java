import java.lang.Thread;

public class ThreadUsingThreadClass extends Thread {

	private String name;

	public ThreadUsingThreadClass(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.println("Thread " + name + " running.");

	}

	public static void main(String[] args) {
		ThreadUsingThreadClass t1 = new ThreadUsingThreadClass("Thread 1");
		ThreadUsingThreadClass t2 = new ThreadUsingThreadClass("Thread 2");
		ThreadUsingThreadClass t3 = new ThreadUsingThreadClass("Thread 3");
		ThreadUsingThreadClass t4 = new ThreadUsingThreadClass("Thread 4");
		t1.start();
		t2.start();
		t3.start();
		t4.start();


	}

}
