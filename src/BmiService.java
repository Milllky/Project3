public class BmiService {
    public int calculate(double weightKg, double heightM) {
        int result = (int) (weightKg / Math.pow(heightM, 2));
        return result;
    }
}