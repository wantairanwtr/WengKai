package panduan;
import java.util.Scanner;
public class Bijiaoshu {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.print("����x��ֵ:");
		int x=in.nextInt();
		System.out.print("����y��ֵ:");
		int y=in.nextInt();
		System.out.print("����z��ֵ:");
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
		System.out.println("��������:"+max);
	}

}
