package panduan;
import java.util.Scanner;
public class Bijiaoshu {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.print("输入x的值:");
		int x=in.nextInt();
		System.out.print("输入y的值:");
		int y=in.nextInt();
		System.out.print("输入z的值:");
		int z=in.nextInt();
		int max;
		if(x>y) {
			if(x>z) {
				max=x;
			}else {
				max=z;
			}
		}else {
			if(y>z) {
				max=y;
			}else {
				max=z;
			}
		}
		System.out.println("最大的数是:"+max);
	}

}
