package xunhuankongzhi;

public class Yibaineisushu {
	public static void main(String[]args) {
		int n=100;
		int m;
		int c;
		for(int i=2;i<=100;i++) {
			m=1;
			for(c=2;c<i;c++) {
				if(i%c==0) {
					m=0;
					break;
				}
			}
			if(m==1) {
				System.out.println(c);
			}
		}
	}
}
