public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
