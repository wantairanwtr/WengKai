package xunhuankongzhi;
import java.util.Scanner;
public class Yingbi {
	public static void main(String[]args) {
		Scanner in=new Scanner(System.in);
		int amount=in.nextInt();
		int count=0;
		OUT:for(int one=0;one<=amount;one++) {
			for(int five=0;five<=amount/5;five++) {
				for(int ten=0;ten<=amount/10;ten++) {
					for(int twenty=0;twenty<=amount/20;twenty++) {
						if(one+five*5+ten*10+twenty*20==amount) {
							System.out.println(one+"��1Ԫ"+five+"��5Ԫ"+ten+"��10Ԫ"+twenty+"��20Ԫ");
							count+=1;
							break OUT;
						}
					}
				}
			}
		}
		System.out.println("�ܹ�"+count+"�����");
	}
}
