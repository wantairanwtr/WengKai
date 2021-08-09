package Duixiang;

import java.util.Scanner;

public class Zifuchuan2 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String a="abc";
        String b=a;
        String c=in.next();
        System.out.println(a==b);
        System.out.println(a.equals(c));
    }
}
