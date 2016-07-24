package Threads;

class MyThread extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				sleep(200);
				System.out.println("inside try: "+i);
			} catch (InterruptedException e) {
			}
		}
	}}
public class ThreadDemo1{
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		System.out.println(t1.currentThread());
		System.out.println(t2.currentThread());
		t1.setPriority(1);
		t2.setPriority(10);
		t1.start();
		t2.start();

//		the difference between ThreadDemo0 and ThreadDemo1 classes is
// that the last one is free to extend another class.
	}
}