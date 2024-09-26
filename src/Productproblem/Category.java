public abstract class Category extends Product {
    private static final double price = 0;
    private final String categoryName;

    public Category(String productName, String categoryName) {
        super(productName, price);
        this.categoryName = categoryName;

    }
    public String getCategoryName() {
        return categoryName;

    }




}
