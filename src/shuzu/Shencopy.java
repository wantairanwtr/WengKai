package shuzu;

public class Shencopy {
	public static void main(String[]args) {
		int[]a= {1,2,3,4,5};
		int[]b=new int[a.length];
		for(int i=0;i<b.length;i++) {
			b[i]=a[i];
		}
		boolean isyn=true;
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
			if(b[i]!=a[i]) {
				System.out.println("a与b不相等");
				break;
			}
		}
		System.out.println(a==b);
	}
}
