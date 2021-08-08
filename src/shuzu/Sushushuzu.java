package shuzu;

import java.util.Scanner;

public class Sushushuzu {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int[] primes=new int[50];
        primes[0]=2;
        int cnt=1;
        A:for(int x=3;cnt<50;x+=2){
            for(int i=0;i<cnt;i++){
                if(x%primes[i]==0){
                    continue A;
                }
            }
            primes[cnt++]=x;
        }
        for(int k:primes){
            System.out.print(k+" ");
        }
    }
}
