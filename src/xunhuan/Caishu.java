package xunhuan;
import java.util.Scanner;
public class Caishu {
	public static void main(String[]args) {
		Scanner in=new Scanner(System.in);
		int count=0;
		int c=0;
		int number=(int)(Math.random()*100+1);
		System.out.println("��ӭ��������");
		do{
			System.out.println("����������");
			c=in.nextInt();
			count+=1;
			if(c>number) {
				System.out.println("����");
			}else if(c<number){
				System.out.println("С��");
			}
		}while(c!=number);
		System.out.print("�¶���,�ܹ�����"+count+"��");
	}

}
