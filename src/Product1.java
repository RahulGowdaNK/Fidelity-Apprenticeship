public class Product1 {
    private int productID;
    private String productName;
    private double productPrice;

    public Product1(int productID, String productName, double productPrice) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;

    }

    public void displayProduct() {
        System.out.println("Product Id" + productID);
        System.out.println("Product Name" + productName);
        System.out.println("Product price" + productPrice);
        System.out.println(".......");
    }

    public static void main(String[] args) {


        Product1 product1 = new Product1('Apple', 'phone', 1200);
        Product1 product2 = new Product1('Samsung', 'tv', '1250');
        Product1 product3 = new Product1('sony', 'Headphone', 1900);
        Product1 product4 = new Product1('Hp', 'laptop', 1800);
        Product1 product5 = new Product1('Canon', 'camera', 19900);

        product1.display();
        product2.display();
        product3.display();
        product4.display();
        product5.display();
    }
}
}









