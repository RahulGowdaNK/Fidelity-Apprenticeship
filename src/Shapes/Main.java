

public class Main {
    public static void main(String[] args) {
        Circle circle=new Circle(4);
        System.out.println("Area of Circle" + circle.CalculateArea());

        Rectangle rectangle=new Rectangle(4,6);
        System.out.println(" \nArea of rectangle" + rectangle.CalculateArea());
        Square square=new Square(9);
        System.out.println("\nArea of square" +square.calculateArea());



    }

}