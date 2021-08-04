package xunhuan;

import java.util.Scanner;

public class Fenjie {
	public static void main(String[]args) {
		Scanner in=new Scanner(System.in);
		int c=in.nextInt();
		int n;
		int s=0;
		while(c!=0){
			n=c%10;
			c=c/10;
			s=s*10+n;
		}
		System.out.println(s);
	}

}