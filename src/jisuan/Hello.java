package jisuan;
import java.util.Scanner;
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello!wantairan");
		Scanner in=new Scanner(System.in);
//		System.out.println("echo:"+sc.nextLine());
		int amount=100;
		int price;
		System.out.print("�������");
		amount=in.nextInt();
		System.out.print("����۸�");
		price=in.nextInt();
		System.out.println(amount+"-"+price+"="+(amount-price));
	}

}
