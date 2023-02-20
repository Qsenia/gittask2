public class Main {
    public static void main(String[] args) {
        int[] sales = new int[]{1000, 50, 200, 40, 60, 70, 90, 570, 1000, 40};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println("Максимальные продажи в литрах: "+ salesManager.max() + " л");
        System.out.println("Минимальные продажи в литрах: "+salesManager.min() + " л");
        System.out.println("Обрезанные средние продажи в л: "+salesManager.average()+ " л");
    }
}