public class Cylinder extends Circle {
    private double height;

    public Cylinder(String color, String texture, double radius, double height) {
        super(color, texture, radius);
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Cylinder with a color of " + getColor() + ", while having a " + getTexture() + " texture");
        System.out.println("The cylinder inherits the circle's radius attribute to have a radius of " + getRadius());
        System.out.println("While the cylinder has the height of " + getHeight());
    }

    @Override
    public double getArea() {
        return 2 * super.getArea() + 2 * Math.PI * getRadius() * height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateVolume() {
        return super.getArea() * height;
    }
}
