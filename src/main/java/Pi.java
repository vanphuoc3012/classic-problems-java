public class Pi {
    public static double calculatePi(int nTerms) {
        final double numerator = 4;
        double denominator = 1;
        double operator = 1;
        double pi = 0;
        for (int i = 0; i < nTerms; i++) {
            pi += operator * (numerator / denominator);
            denominator += 2;
            operator *= -1;
        }
        return pi;
    }
}
