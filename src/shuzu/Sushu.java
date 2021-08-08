package shuzu;

import java.util.Scanner;

public class Sushu {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        boolean k =true;
        int n=in.nextInt();
        if(n==1||n%2==0&&n!=2){
            k=false;
        }else{
            for(int i=3;i<Math.sqrt(n);i+=2){
                if(n%i==0){
                    k=false;
                    break;
                }
            }
        }
        if(k){
            System.out.println(n+"是素数");
        }
    }
}
