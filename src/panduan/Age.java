package panduan;
import java.util.Scanner;
public class Age {
	public static void main(String[]args) {
		final int minor=35;
		Scanner in = new Scanner(System.in);
		int age= in.nextInt();
		System.out.println("���������:"+age);
		if(age<minor) {
			System.out.println("���������");
		}
	}
}
