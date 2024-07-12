public class Triangle extends Shape {
    private double base, height;

    public Triangle(String color, String texture, double base, double height) {
        super(color, texture);
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Triangle with a color of " + getColor() + ", while having a" + getTexture() + " texture");
        System.out.println("The Triangle has a base of " + getBase() + " and a height of " + getHeight());
    }

    public double getArea() {
        return base * height / 2;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
