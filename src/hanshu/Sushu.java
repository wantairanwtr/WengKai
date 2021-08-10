package hanshu;

import java.util.Scanner;

public class Sushu {
    public static boolean isPrime(int i) {
        boolean isprime = true;
        for (int k = 2; k < i; k++) {
            if (i % k == 0) {
                isprime = false;
                break;
            }
        }
        return isprime;
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("输入素数起始位置");
        int m=in.nextInt();
        System.out.println("输入素数结束为止");
        int n=in.nextInt();
        if(m==1){
            m=2;
        }
        int cnt=0;
        int sum=0;
        for(int i=m;i<=n;i++){
            if(isPrime(i)){
                cnt++;
                sum+=i;
            }
        }
        System.out.println("从"+m+"到"+n+"之间的素数个数为"+cnt+",所有素数之和为"+sum);
        System.out.println(2+3+5+7+11+13+17+19);
    }
}
