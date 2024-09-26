public class Fiveproduct {
    private int productID;
    private String productName;
    private double productPrice;

    public Fiveproduct(int productID, String productName, int productPrice) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
    }
    public void display() {
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + productPrice);

    }
    public static void main(String[] args) {

        Fiveproduct[] product = new Fiveproduct[5];
        product[0] = new Fiveproduct(10, "apple", 5000);
        product[1] = new Fiveproduct(11, "grape", 5900);
        product[2] = new Fiveproduct(12, "cola", 5009);
        product[3] = new Fiveproduct(13, "Dragonfruit", 9000);
        product[4] = new Fiveproduct(14, "pineapple", 5090);

        for (int i = 0; i < product.length; i++) {
            product[i].display();
        }


    }
}
