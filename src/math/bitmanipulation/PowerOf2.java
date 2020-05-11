package math.bitmanipulation;

public class PowerOf2 {
    public static void main(String[] args){
        int num = 5;
        System.out.println(computePowerOf2(num));
    }

    public static int computePowerOf2(int num){
        return 1<<num;
    }
}
