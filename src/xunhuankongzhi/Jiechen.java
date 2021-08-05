package xunhuankongzhi;
import java.util.Scanner;
public class Jiechen {
	public static void main(String[]args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		long s=1;
		for(int c=1;c<=n;c++) {
			s*=c;
		}
		System.out.println(s);
	}

}
