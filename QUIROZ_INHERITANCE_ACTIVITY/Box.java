public class Box extends Rectangle {
    private double height;

    public Box(String color, String texture, double width, double length, double height) {
        super(color, texture, width, length);
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Box with a color of " + getColor() + ", while having a " + getTexture() + " texture");
        System.out.println("The box inherits the rectangle's length and width attributes to have " + getWidth() + " and " + getLength());
        System.out.println("While the Box has the height of " + getHeight());
    }

    @Override
    public double getArea() {
        return 2 * (getLength() * getWidth() + getLength() * height + getWidth() * height);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateVolume() {
        return super.getArea()* height;
    }
}
