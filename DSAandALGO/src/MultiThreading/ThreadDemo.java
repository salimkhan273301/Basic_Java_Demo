package MultiThreading;

public class ThreadDemo extends Thread{
	
	public void run() {
		for(int i=0; i<=10; i++)
		{
			if(i%2==0)
			System.out.print(i+"\t");
			else
				System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
	

	public static void main(String[] args) {
		ThreadDemo obj=new ThreadDemo();
		obj.start();
		

	}

}
