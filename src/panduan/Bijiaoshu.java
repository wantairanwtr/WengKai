package panduan;
import java.util.Scanner;
public class Bijiaoshu {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.print("输入x的值:");
		int x=in.nextInt();
		System.out.print("输入y的值:");
		int y=in.nextInt();
		int max;
		if(x>y) {
			max=x;
		}else {
			max=y;
		}
		System.out.println("最大的数是"+max);
	}

}
