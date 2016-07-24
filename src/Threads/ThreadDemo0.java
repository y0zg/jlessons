package Threads;
//Here are some useful methods in the Thread class.
//
//public String getName()
//		Returns the thread’s name.
//
//public Thread.State getState()
//		Returns the state the thread is currently in.
//
//public void interrupt()
//		Interrupts this thread.
//
//public void start()
//		Starts this thread.
//
//public static void sleep(long millis)
//		Stops the current thread for the specified number of milliseconds.

public class ThreadDemo0 extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
	public static void main(String[] args) {
		(new ThreadDemo0()).start();
//		Calling the start method will make the thread move from NEW to RUNNABLE, which causes the run method to be called.
//		This method prints number 1 to 10 and between two numbers the thread sleeps for a second.
//		When the run method returns the thread dies and will be garbage collected.
//		There is nothing fancy about this class, but it gives you a general idea of how to work with Thread.
	}
}
