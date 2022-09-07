import java.math.BigInteger;
import java.math.*;

public class Problem3 {

    public static BigInteger sqrt(BigInteger x) {
        BigInteger div = BigInteger.ZERO.setBit(x.bitLength()/2);
        BigInteger div2 = div;
        // Loop until we hit the same value twice in a row, or wind
        // up alternating.
        for(;;) {
            BigInteger y = div.add(x.divide(div)).shiftRight(1);
            if (y.equals(div) || y.equals(div2))
                return y;
            div2 = div;
            div = y;
        }
    }

    // function to find largest prime factor
    static BigInteger maxPrimeFactors( BigInteger n)
    {
        // Initialize the maximum prime
        // factor variable with the
        // lowest one
        BigInteger maxPrime = BigInteger.valueOf(-1);

        // Print the number of 2s
        // that divide n
        while (n.remainder(BigInteger.valueOf(2)) == BigInteger.ZERO) {
            maxPrime = BigInteger.valueOf(2);

            // equivalent to n /= 2
            //n >>= 1;
            n = n.divide(BigInteger.valueOf(2));
        }

        // n must be odd at this point,
        // thus skip the even numbers
        // and iterate only for odd
        // integers
        for (BigInteger i = BigInteger.valueOf(3); i.compareTo(Problem3.sqrt(n)) <= 0; i = i.add(BigInteger.valueOf(2))) {
            while (n.remainder(i) == BigInteger.ZERO) {
                maxPrime = i;
                n = n.divide(i);
            }
        }

        // This condition is to handle
        // the case when n is a prime
        // number greater than 2
        if (n.compareTo(BigInteger.valueOf(2)) > 0)
            maxPrime = n;

        return maxPrime;
    }

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
        BigInteger bigNum = new BigInteger("600851475143");
        BigInteger largestPrimeFactor = BigInteger.valueOf(1);


        System.out.println(maxPrimeFactors(bigNum));

        // https://byjus.com/maths/prime-factorization/
        /*int i = 2;

        for (; i <= 1000; i++) {
            if (primeNaive(i)) {
                System.out.println("Prime:" + i);
                largestPrimeFactor = largestPrimeFactor.multiply(BigInteger.valueOf(i));
                bigNum = bigNum.divide(BigInteger.valueOf(i));

                System.out.println("Divided: " + bigNum + " remainer: " + bigNum.remainder(BigInteger.valueOf(i)));

                if (bigNum == BigInteger.ONE) {
                    System.out.println("Largest prime factor:" + bigNum);
                }
            }
        }*/
    }
}
