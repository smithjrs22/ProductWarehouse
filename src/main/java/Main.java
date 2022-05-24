public class Main {
    public static void main (String[] args){
//        ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
//        juice.addToWarehouse(1000.0);
//        juice.takeFromWarehouse(11.3);
//        System.out.println(juice.getName()); // Juice
//        System.out.println(juice);           // balance = 988.7, space left 11.3
//        ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
//        juice.addToWarehouse(1000.0);
//        juice.takeFromWarehouse(11.3);
//        System.out.println(juice.getName()); // Juice
//        juice.addToWarehouse(1.0);
//        System.out.println(juice);           // Juice: balance = 989.7, space left 10.299999999999955

        // the usual:
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName()); // Juice
        juice.addToWarehouse(1.0);
        System.out.println(juice);           // Juice: balance = 989.7, space left 10.3

// etc

// and now we have the history:
        System.out.println(juice.history()); // [1000.0, 988.7, 989.7]
    }
}
