package xunhuankongzhi;
import java.util.Scanner;
public class Zuidagongyue {
	public static void main(String[]args) {
		Scanner in =new Scanner(System.in);
		System.out.print("a:");
		int a=in.nextInt();
		System.out.print("b:");
		int b=in.nextInt();
		int n=1;
		for(int i=2;i<=a&&i<=b;i++) {
			if(a%i==0&&b%i==0) {
				n=i;
			}
		}
		System.out.println("最大公约数是"+n);
	}
}
