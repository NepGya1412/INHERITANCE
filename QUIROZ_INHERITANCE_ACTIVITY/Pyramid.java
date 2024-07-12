public class Pyramid extends Triangle {
    private double width;

    public Pyramid(String color, String texture, double base, double height, double width) {
        super(color, texture, base, height);
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Pyramid with a color of " + getColor() + ", while having a " + getTexture() + " texture");
        System.out.println("The pyramid inherits the triangle's base and height attributes to have " + getBase() + " and " + getHeight());
        System.out.println("While the pyramid has the width of " + getWidth());
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculateVolume() {
        return (super.getArea() * width) / 3;
    }
}
