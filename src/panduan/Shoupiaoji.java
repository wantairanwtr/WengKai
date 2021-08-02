package panduan;
import java.util.Scanner;
public class Shoupiaoji {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("ÇëÍ¶±Ò");
		int amount =in.nextInt();
		if(amount>=10) {
		System.out.println("Æ±¼Û10Ôª");
		System.out.println("ÕÒÁã:"+(amount-10));
		}
	}
}
