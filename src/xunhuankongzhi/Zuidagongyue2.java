package xunhuankongzhi;
import java.util.Scanner;
public class Zuidagongyue2 {
	public static void main(String[]args) {
		Scanner in=new Scanner(System.in);
		System.out.println("a:");
		int a=in.nextInt();
		System.out.println("b:");
		int b=in.nextInt();
		int r;
		while(b!=0){	
			r=a%b;
			a=b;
			b=r;
		}
		System.out.println("最大公约数是"+a);
	}
}
