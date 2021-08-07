package shuzu;

import java.util.Scanner;

public class Bianli {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int[] data={3,2,5,7,4,9,11,34,12,28};
        int x=in.nextInt();
        int loc=-1;
        boolean found=false;
        for(int i=0;i<data.length;i++){
            if(data[i]==x){
                loc=i;
                System.out.println("位置在"+i);
                break;
            }
        }
        for(int k:data){
            if(k==x){
                found=true;
                break;
            }
        }
        System.out.println(found);
    }
}
