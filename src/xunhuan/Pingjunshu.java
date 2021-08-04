package xunhuan;

import java.util.Scanner;

public class Pingjunshu {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int c=0;
		double s=0;
		int count=0;
		while(true) {
			System.out.println("输入一个数");
			c=in.nextInt();
			if(c!=-1) {
			s+=c;
			count+=1;
			}else {
				System.out.println("平均数是"+s/count);
				break;
			}
		}
	}

}
