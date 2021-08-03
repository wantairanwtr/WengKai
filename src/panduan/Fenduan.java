package panduan;
import java.util.Scanner;
public class Fenduan {
	public static void main(String[]args) {
		Scanner in=new Scanner(System.in);
		System.out.print("输入x的值:");
		int x=in.nextInt();
		int f;
		if(x<0) {
			f=-1;
		}else if(x==0) {
			f=0;
		}else {
			f=2*x;
		}
		System.out.println("f的值是:"+f);
	}

}
