public class BmiService {
    public int calculate(double weightKg, double heightM) {
        int result = (int) (weightKg / (heightM * heightM));
        return result;
    }
}