package panduan;
import java.util.Scanner;
public class Shoupiaoji {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("��Ͷ��");
		int amount =in.nextInt();
		if(amount>=10) {
		System.out.println("Ʊ��10Ԫ");
		System.out.println("����:"+(amount-10));
		}
	}
}
