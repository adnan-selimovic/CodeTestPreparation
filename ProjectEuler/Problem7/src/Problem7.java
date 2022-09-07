public class Problem7 {

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

    // https://projecteuler.net/problem=7
    public static void main(String[] args) {
        int n = 2;

        int count = 0;
        while (true) {
            if (primeNaive(n)) {
                count++;
                System.out.println(count + " "+ n);

                if (count > 10001) {
                    break;
                }
            }
            n++;
        }
    }
}
