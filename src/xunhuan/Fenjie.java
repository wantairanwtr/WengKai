package xunhuan;

import java.util.Scanner;

public class Fenjie {
	public static void mian(String[]args) {
		Scanner in=new Scanner(System.in);
		int c=in.nextInt();
		int n;
		while(c!=0){
			n=c%10;
			c=c/10;
			System.out.println(c);
			System.out.println(n);
		}
		System.out.println("½áÊø");
	}

}