package hanshu;

public class Jiechen {
    public static int jiechen(int i){
        if(i==1){
            return 1;
        }else{
            return i*jiechen(i-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(jiechen(3));
    }
}
