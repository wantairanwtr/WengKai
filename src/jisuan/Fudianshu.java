package jisuan;
import java.util.Scanner;
public class Fudianshu {
	public static void main(String [] args) {
		double foot;
		double inch;
		Scanner in = new Scanner(System.in);
		System.out.print("����Ӣ��:");
		foot=in.nextDouble();
		System.out.print("����Ӣ��");
		inch=in.nextDouble();
		System.out.println((int)((foot+inch/12)*0.3048*100)+"cm");
	}

}
