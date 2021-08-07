package shuzu;

public class Bianliangfuzhi {
	public static void main(String[]args) {
		int[]a=new int[10];
		a[0]=5;
		int[] b=a;
		int c=6;
		int d=c;
		System.out.println("a数组"+a[0]);
		System.out.println("c变量"+c);
		d=9;
		b[0]=16;
		System.out.println("c变量"+c);
		System.out.println("a数组"+a[0]);
	}
}
