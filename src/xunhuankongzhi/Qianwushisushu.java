package xunhuankongzhi;

public class Qianwushisushu {
	public static void main(String[]args) {
		int count=0;
		int c;
		int m;
		for(int i=2;;i++) {
			m=1;
			for(c=2;c<i;c++) {
				if(i%c==0) {
					m=0;
				}
			}
			if(count<50) {
				if(m==1) {
					count+=1;
					System.out.println(count+":"+i);
				}
			}
		}
	}
}
