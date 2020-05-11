package math.bitmanipulation;

public class PowerOf2 {
    public static void main(String[] args) {
        int num1 = 5;
        //will only work till n = 30
        System.out.println(computePowerOf2(num1));
        int num2 = 30;
        System.out.println(computePowerOf2(num2));

        int num3 = 31;
        System.out.println(computePowerOf2Long(num3));
    }

    public static int computePowerOf2(int num) {
        return 1 << num;
    }

    public static long computePowerOf2Long(int num) {
        return 1L << num;
    }
}