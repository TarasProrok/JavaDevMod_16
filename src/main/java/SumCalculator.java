public class SumCalculator {
    public int sum(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n should be non-negative");
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
