package math.bitmanipulation;


public class CheckPowerOfTwo {
    public static void main(String[] args) {
        int t1 = 5;
        int t2 = 1;
        int t3 = 8;
        int t4 = 10;
        int t5 = 512;

        boolean isPowerOfTwo = checkPowerof2(t5);

        if(isPowerOfTwo){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

    public static boolean checkPowerof2(int n){
        return n != 0 && (n & (n-1)) == 0;
    }
}
