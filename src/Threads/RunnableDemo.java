package Threads;
//If you use Runnable, you have to instantiate the Thread class and pass the Runnable

public class RunnableDemo implements Runnable {
public void run(){
	for (int i=0;i<10;i++){
		System.out.println(i);
		try{Thread.sleep(199);}
		catch(InterruptedException e){}
	}
}
	public static void main(String[] args) {
		RunnableDemo demo=new RunnableDemo();
		Thread thread1=new Thread(demo);
		thread1.start();
	}
}
