package panduan;
import java.util.Scanner;
public class Age {
	public static void main(String[]args) {
		final int minor=35;
		Scanner in = new Scanner(System.in);
		int age= in.nextInt();
		System.out.println("你的年龄是:"+age);
		if(age<minor) {
			System.out.println("你是年轻的");
		}
	}
}
