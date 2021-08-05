package xunhuankongzhi;
import java.util.Scanner;
public class Qiuhe {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		double s=0;
		for(double i=1;i<=n;i++) {
			s+=1/i;
		}
		System.out.println(s);
		System.out.printf("%.2f",s);
	}
}
