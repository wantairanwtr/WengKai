package shuzu;

import java.util.Scanner;

public class Sushusuzhu2 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.print("你想构建多少以内的素数:");
        int n=in.nextInt();
        boolean[] primes=new boolean[n];
        for(int i=0;i< primes.length;i++){
            primes[i]=true;
        }
        for(int x=2;x< primes.length;x++) {
            if(primes[x]) {
                for (int i = 2; x * i < primes.length; i++) {
                    primes[x * i] = false;
                }
            }
        }
        for(int i=2;i<primes.length;i++){
            if(primes[i]){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
