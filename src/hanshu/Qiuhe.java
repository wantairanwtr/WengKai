package hanshu;

import java.util.Scanner;

public class Qiuhe {
    public static int sum(int[] numbers){
        int s=0;
        for(int k:numbers){
            s+=k;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("输入你想输入的位数");
        int[] numbers=new int[in.nextInt()];
        int k;
        for(int i=0;i<numbers.length;i++){
            System.out.print("输入一个数:");
            k=in.nextInt();
            if(k!=-1) {
                numbers[i] = k;
            }else {
                break;
            }
            }
        System.out.println("他们的和是"+sum(numbers));


    }
}
