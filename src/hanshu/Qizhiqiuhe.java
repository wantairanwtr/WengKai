package hanshu;

import java.util.Scanner;

public class Qizhiqiuhe {
    public static int sum(int a, int b){
        int s=0;
        for(int i=a;i<=b;i++){
            s+=i;
        }
        return s;
    }
    public static void f(){
        System.out.println("我是f方法");
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("输入计算起始值");
        int a=in.nextInt();
        System.out.println("输入计算结束值");
        int b=in.nextInt();
        System.out.println(sum(a,b));
        f();
    }
}
