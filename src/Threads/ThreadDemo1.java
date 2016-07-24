package Threads;

class MyThread extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				sleep(100);
			} catch (InterruptedException e) {
			}
		}
	}}
public class ThreadDemo1{
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		t1.start();
		System.out.println(t1.currentThread());
		t2.start();
		System.out.println(t2.currentThread());
//		the difference between ThreadDemo0 and ThreadDemo1 classes is
// that the last one is free to extend another class.
	}
}