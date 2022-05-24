public class ProductWarehouse extends Warehouse{
    private String name;
    public ProductWarehouse(String productName, double capacity){
        super(capacity);//calling the super class
        this.name = productName;
    }
    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }
    @Override
    public String toString(){
        return "Juice: " + super.toString();
    }
}