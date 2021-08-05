package xunhuankongzhi;
import java.util.Scanner;
public class Sushu {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int c=1;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				System.out.println("不是素数");
				c=0;
				break;
			}
		}
		if(c==1) {
			System.out.println("是素数");
		}
	}
}
