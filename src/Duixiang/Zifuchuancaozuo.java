package Duixiang;

import java.util.Locale;
import java.util.Scanner;

public class Zifuchuancaozuo {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String s1="abc";
        String s2="abb";
        System.out.println(s1.compareTo(s2));
        String name="hello";
        String str1="one";
        String str2="";
        System.out.println(name.length());
        System.out.println(str1.length());
        System.out.println(str2.length());
        for(int i=0;i<s1.length();i++){
            System.out.println(s1.charAt(i));
        }
        s1="01234567389汉字";
        System.out.println(s1.substring(3,12));
        System.out.println(s1.indexOf('汉'));
        System.out.println(s1.indexOf('A'));
        System.out.println(s1.indexOf("6789"));
        int loc=s1.indexOf('3');
        System.out.println(s1.indexOf('3',loc+1));
        System.out.println(s2.toUpperCase()+s2);
        System.out.println("输入一个词语来匹配");
        switch(in.next()){
            case "你好":
                System.out.println("你输入了你好");
                break;
            case "旧时光":
                System.out.println("你输入了旧时光");
                break;
            default:
                System.out.println("没输入合适的");
                break;
        }
    }
}
