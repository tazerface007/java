import java.lang.Thread;

public class ThreadUsingThreadClass extends Thread {

private String name;
private int seconds;

public ThreadUsingThreadClass(String name, int seconds) {
	this.name = name;
	this.seconds = seconds;
}

@Override
public void run() {
	try{
	Thread.sleep(seconds*1000);
	System.out.println("Thread " + name + " running.");
	}
	catch(InterruptedException e) {
		e.printStackTrace();
	}


}

public static void main(String[] args) {
	ThreadUsingThreadClass t1 = new ThreadUsingThreadClass("Thread 1", 2);
	ThreadUsingThreadClass t2 = new ThreadUsingThreadClass("Thread 2", 4);
	ThreadUsingThreadClass t3 = new ThreadUsingThreadClass("Thread 3", 1);
	ThreadUsingThreadClass t4 = new ThreadUsingThreadClass("Thread 4", 6);
	t1.start();
	t2.start();
	t3.start();
	t4.start();


}

}
