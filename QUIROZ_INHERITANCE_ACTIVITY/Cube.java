public class Cube extends Square {
    private final double side;

    public Cube(String color, String texture, double side) {
        super(color, texture, side);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Cube with a color of " + getColor() + ", while having a " + getTexture() + " texture");
        System.out.println("The Cube inherits the square's side attribute to have a side of " + getSide());
    }

    @Override
    public double getArea() {
        return 6 * super.getArea();
    }
    
    public double calculateVolume() {
        return Math.pow(side, 3);
    }
}
