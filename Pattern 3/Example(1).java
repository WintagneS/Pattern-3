package tp_21091007;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the length of side 1:");
		a = s.nextInt();
		System.out.print("Enter the length of side 2:");
		b = s.nextInt();
		System.out.print("Enter the length of side 3:");
		c = s.nextInt();
		
		if(a<b+c && b<a+c && c<b+a)
			System.out.print("These side lengths form a valid triangle");
		else System.out.print("These side lengths do not form a valid triangle");
			
			
	}

}
