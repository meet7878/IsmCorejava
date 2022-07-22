/*16.Create 1 thread that find sum of 1 to 100 and print sum. 

create 2 thread 1st thread find sum of 1 to 50 and 2nd thread find sum of 51 to 100
once both the thread find sum then print final sum. 
-------------------------------------------------------------*/
package Taskjava;

public class ThreadSum extends Thread implements Runnable {
	private int start;
	private int stop;
	private static int sum;
	public ThreadSum(int start,int stop) {
		this.start = start;
		this.stop = stop;
		this.sum=0;
	}
	public static void setSum(int sum) {
		ThreadSum.sum = sum;
	}
	public void run() {
		System.out.println(Thread.currentThread().getName());//thread- 0
		for(int i=start;i<=stop;i++) {
			sum+=i;
			System.out.println(i);
		}
		
	}

 public static void main(String[] args) throws InterruptedException {
	ThreadSum t = new ThreadSum(1,50);
	ThreadSum t1 = new ThreadSum(51,100);
	t.start();
	System.out.println(t.isAlive());
	System.out.println(t1.isAlive());
	
	//t.setName("Meet");
	//t1.setName("hardik");
	System.out.println(Thread.currentThread().getName());//main
	 
	
	 synchronized (t) {
		
		 t.wait();
		 t.notify();
		
		 }
	 t1.start();
	 
	
	 
	 
	Thread.sleep(1000);
	System.out.println(t.getSum());


}
public  int getSum() {
	return sum;
}
}