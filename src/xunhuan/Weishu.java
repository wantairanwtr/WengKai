package xunhuan;

import java.util.Scanner;

public class Weishu {
	public static void main(String[]args) {
		Scanner in =new Scanner(System.in);
		int number=in.nextInt();
		int count=0;
		do{
			number/=10;
			count+=1;
		}while(number>0);
		System.out.println("λ��Ϊ:"+count);
	}

}
