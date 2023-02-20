public class Main {
    public static void main(String[] args) {
        long[] sales = new long[]{1000, 50, 200, 40, 60, 70, 90, 570, 1000, 40};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println("Максимальные продажи в литрах: ");
        System.out.println(salesManager.max() + " л");
    }
}