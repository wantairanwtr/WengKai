package panduan;
import java.util.Scanner;
public class Bijiaoshu {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.print("����x��ֵ:");
		int x=in.nextInt();
		System.out.print("����y��ֵ:");
		int y=in.nextInt();
		int max;
		if(x>y) {
			max=x;
		}else {
			max=y;
		}
		System.out.println("��������"+max);
	}

}
