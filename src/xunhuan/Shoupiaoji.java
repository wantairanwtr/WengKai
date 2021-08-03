package xunhuan;
import java.util.Scanner;
public class Shoupiaoji {
	public static void main(String[]args) {
		int balance=0;
		Scanner in = new Scanner(System.in);	
		while(true) {
			System.out.println("«ÎÕ∂±“");
			int amount=in.nextInt();
			balance+=amount;
			if(balance>=10) {
				System.out.println("’“¡„"+(balance-10));
				balance=0;
			}
		}
	}

}
