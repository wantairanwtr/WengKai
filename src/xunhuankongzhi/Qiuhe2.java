package xunhuankongzhi;
import java.util.Scanner;
public class Qiuhe2 {
	public static void main(String[]args) {
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		double s=0;
		int c=1;
		for(double i=1;i<=n;i++,c=-c) {
			System.out.println(c);
			s+=c/i;
		}
		System.out.println(s);
	}
}
