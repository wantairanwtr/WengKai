package panduan;
import java.util.Scanner;
public class SwitchDemo {
	public static void main(String[]args) {
		Scanner in =new Scanner(System.in);
		System.out.print("�������ֵ");
		int x=in.nextInt();
		switch(x){
			case 1:
				System.out.println("���");
				break;
			case 2:
				System.out.println("���Ϻ�");
				break;
			case 3:
				System.out.println("�����");
				break;
			case 4:
				System.out.println("���Ϻ�");
				break;
			default:
				System.out.println("�������");
				break;
		}
	}

}
