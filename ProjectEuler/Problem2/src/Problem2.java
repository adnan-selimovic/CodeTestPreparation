public class Problem2 {

    // https://projecteuler.net/problem=2
    public static void main(String args[]) {
        int n1 = 0, n2 = 1, sum, totalSum = 0;

        // 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

        while (totalSum <= 4000000) {
            sum = n1 + n2;
            System.out.println("Fibonacci:" + sum);
            n1 = n2;
            n2 = sum;
            if ((sum % 2) == 0)
                totalSum += sum;
        }

        System.out.println("Total sum:" + totalSum);
    }
}
