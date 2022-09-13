package CodeAskedIniterviews;

import java.util.Iterator;

class A extends Thread
{
	String s;
	A(String s)
	{
		this.s=s;
	}
	
	@Override
	synchronized	public void run() 
	{
		for(int i=0;i<5;i++)
		System.out.println(s +" Hello");
	}
	
	

}


public class ThreadSynDemo {
	
	public static void main(String[] args) 
	{
		
	
		A t1=new A("Abhi");
		t1.start();
		
	
		
		try {
			t1.wait(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		A t2=new A("Om");
		t1.start();
		
		
		try {
			t1.sleep(1000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
