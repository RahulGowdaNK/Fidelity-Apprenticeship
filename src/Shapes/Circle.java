public class Circle extends Shape {
    private double radius;
    public Circle( double radius) {
        this.radius = radius;
    }
    public double CalculateArea(){
        return Math.PI * radius * radius;
    }
}
