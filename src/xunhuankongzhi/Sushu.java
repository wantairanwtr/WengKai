package xunhuankongzhi;
import java.util.Scanner;
public class Sushu {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		boolean c=true;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				System.out.println("不是素数");
				c=false;
				break;
			}
		}
		if(c) {
			System.out.println("是素数");
		}
	}
}
