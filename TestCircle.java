public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.0);
        Circle c2 = new Circle(5.0);
        Circle c3 = new Circle(7.0);

        // Test the equals
        System.out.println("c1 equals c2? " + c1.equals(c2));
        System.out.println("c1 equals c3? " + c1.equals(c3));

        // test compareTo
        System.out.println("c1 compared to c2: " + c1.compareTo(c2));
        System.out.println("c1 compared to c3: " + c1.compareTo(c3));
        System.out.println("c3 compared to c1: " + c3.compareTo(c1));     
    }
}