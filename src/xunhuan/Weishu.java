package xunhuan;

import java.util.Scanner;

public class Weishu {
	public static void main(String[]args) {
		Scanner in =new Scanner(System.in);
		int number=in.nextInt();
		int count=0;
		while(number>0) {
			number/=10;
			count+=1;
		}
		System.out.println("Î»ÊıÎª:"+count);
	}

}
