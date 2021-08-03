package panduan;
import java.util.Scanner;
public class SwitchDemo {
	public static void main(String[]args) {
		Scanner in =new Scanner(System.in);
		System.out.print("输入变量值");
		int x=in.nextInt();
		switch(x){
			case 1:
				System.out.println("你好");
				break;
			case 2:
				System.out.println("早上好");
				break;
			case 3:
				System.out.println("中午好");
				break;
			case 4:
				System.out.println("晚上好");
				break;
			default:
				System.out.println("输入错误");
				break;
		}
	}

}
