public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int index = (int) service.calculate(79.5, 1.76);
        System.out.println(index);
    }
}