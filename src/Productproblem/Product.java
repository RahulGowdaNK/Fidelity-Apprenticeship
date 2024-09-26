public class Product{
    private final String productName;
    private final double price;
    protected Object category;

    public Product(String productName, double price){
        this.productName = productName;
        this.price = price;
    }
    public String getProductName(){
        return productName;
    }
    public double getPrice(){
        return price;
        
    }
}