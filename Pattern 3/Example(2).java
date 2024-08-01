package tp_21091007;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner s= new Scanner(System.in);
		System.out.print("Input Number:");
		a = s.nextInt();
		c=a;
		while(c>0)
		{
		for(int i=2;i<=a;i++)
		{
			if(i%1==0 && i%i==0 && (i-1)%2!=0)
				a=a%i;
		System.out.print(i);
			if(a%i==0)
				System.out.print(i);
		}
		c--;
		}
	}

}
