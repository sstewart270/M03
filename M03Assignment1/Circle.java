public class Circle extends GeometricObject implements Comparable<Circle> {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public void printCircle() {
        System.out.println("The curcle is created " + getDateCreated() +
                " and the radius is " + radius);
    }

    public int compareTo(Circle o) {
        return Double.compare(this.radius, o.radius);
    }

    public boolean equals(Object o) {
        if (o instanceof Circle) {
            Circle c = (Circle) o;
            return Double.compare(this.radius, c.radius) == 0;
        }
        return false;
    }
}