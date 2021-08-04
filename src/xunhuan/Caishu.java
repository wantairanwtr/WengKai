package xunhuan;
import java.util.Scanner;
public class Caishu {
	public static void main(String[]args) {
		Scanner in=new Scanner(System.in);
		int count=0;
		int c=0;
		int number=(int)(Math.random()*100+1);
		System.out.println("欢迎来猜数字");
		do{
			System.out.println("请输入数字");
			c=in.nextInt();
			count+=1;
			if(c>number) {
				System.out.println("大了");
			}else if(c<number){
				System.out.println("小了");
			}
		}while(c!=number);
		System.out.print("猜对了,总共猜了"+count+"次");
	}

}
