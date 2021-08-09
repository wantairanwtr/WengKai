package shuzu;

public class Erweishuzu {
    public static void main(String[] args) {
        int[][] a=new int[3][5];
        for(int i=0;i<a.length;i++){
            for(int k=0;k<a[i].length;k++){
                a[i][k]=i*k;
            }
        }
        for(int[] i:a){
            for(int k:i){
                System.out.print(i+":"+k+" ");
            }
            System.out.println();
        }
    }
}
