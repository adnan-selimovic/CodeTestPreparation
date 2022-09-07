import java.math.BigInteger;

public class Problem10 {

    private static boolean primeNaive(int n) {
        if(n<2){
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int n = 2;
        BigInteger sum = new BigInteger("0");

        int count = 0;
        while (true) {
            if (primeNaive(n)) {
                count++;
                sum = sum.add(BigInteger.valueOf(n));
                System.out.println(count + " "+ n + " " + sum);

                if (count >= 2000000) {
                    break;
                }
            }
            n++;
        }
    }
}
