public class SumCalculator {
    public static int sum(int n) throws IllegalArgumentException {
        if ((n < 0) || (n==0)) {
            throw new IllegalArgumentException("n bigger then 0");
        }
        if (n == 0) {
            throw new IllegalArgumentException("n should not be equals to 0");
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
