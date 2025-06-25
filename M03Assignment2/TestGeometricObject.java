public class TestGeometricObject {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(7);

        Rectangle r1 = new Rectangle(4, 6);
        Rectangle r2 = new Rectangle (5, 4);

        GeometricObject biggerCircle = GeometricObject.max(c1, c2);
        GeometricObject biggerRectangle = GeometricObject.max(r1, r2);

        System.out.println("Larger Circle area: " + biggerCircle.getArea());
        System.out.println("Larger Rectangle area: " + biggerRectangle.getArea());
    }
}