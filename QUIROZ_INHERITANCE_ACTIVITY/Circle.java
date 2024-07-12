public class Circle extends Shape {
    private double radius;

    public Circle(String color, String texture, double radius) {
        super(color, texture);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle with a color of " + getColor() + ", while having a " + getTexture() + " texture");
        System.out.println("The Radius of the circle is " + getRadius());
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
