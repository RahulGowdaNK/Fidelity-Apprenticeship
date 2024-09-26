public class Brand extends Category {
    private String brandName;

    public Brand(String productName, String brandName,String categoryName,double price) {
        super(productName,categoryName);
        this.brandName = brandName;
    }

    public static void main(String[]args){
        Brand brand = new Brand("shoes","Nike","Footwear",120);
        System.out.println("Product:" +brand.getProductName());
        System.out.println("Category:" +brand.getCategoryName());

        System.out.println("Price:" +brand.getPrice());
        System.out.println(brand.getBrandName());
    }

    private boolean getBrandName() {
        return brandName.equals("Footwear");
    }
}
