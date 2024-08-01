package tp_21091007;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b=1,c,d=9,i,l;
		Scanner s = new Scanner(System.in);
		System.out.print("Input the starting point of the last row:");
		a = s.nextInt();
		c=a+1;
		
		while (c>0)
		{
		
		for(i = 1;i<=b;i++)
		{
		
			if(i==b)
			{
				System.out.print("*");
					for(int k=0;k<=b-2;k++)
					{
						System.out.print(d-k);
						System.out.print(" ");
					}
			}
			else
		
				for(int m=b-1;m>=0;m--)
				{
					System.out.print(d-m);
				System.out.print(" ");
				}
				
				
				
				
				
		
			
			
		}
			
		System.out.println();
		b++;
		c--;
		
		}
	}

}
