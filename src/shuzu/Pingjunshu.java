package shuzu;
import java.util.Scanner;
public class Pingjunshu {
	public static void main(String[]args) {
		Scanner in =new Scanner(System.in);
		double sum=0;
		System.out.println("���봴����������");
		int cnt=in.nextInt();
		int[]numbers=new int[cnt];
		for(int i=0;i<cnt;i++) {
			numbers[i]=in.nextInt();
			sum+=numbers[i];
		}
		double c=sum/cnt;
		System.out.println("ƽ������"+c);
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]>c) {
				System.out.print(numbers[i]+" ");
			}
		}
		System.out.println("����ƽ����");
	}
}
