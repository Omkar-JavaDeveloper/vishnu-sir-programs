package CodeAskedIniterviews;

import java.util.Scanner;

class Ulkesh
{
	
 static	Ulkesh show(){
		
		Ulkesh ulkesh=new Ulkesh();
		return ulkesh;
	}

	
	void disp()
	{
		
		Ulkesh u=show();
		
		
	}
	
}


public class Primeno {

	public static void main(String[] args) {

		
		
		Ulkesh u=Ulkesh.show();
			u.show();
		
		
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("please enter the number");
		
		int m= scanner.nextInt();
		
		int count=1;
		
		for (int n = 2; n < m; n++)
		{

				if(m%n==0)
				{
					
					count++;
					
				}
				
		}

		if (count>=2) 
		{
			System.out.println("Not prime");
		}
		else {
			System.out.println("Prime");
		}
		
	}

}
