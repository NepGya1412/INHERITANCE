public class Square extends Shape {
    private double side;

    public Square(String color, String texture, double side) {
        super(color, texture);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Square with a color of " + getColor() + " while having a " + getTexture() + " texture");
        System.out.println("The Square has a side of " + getSide());
    }

    public double getArea(){
        return side * side;
    }

    public double getSide(){
        return side;
    }

    public void setSide(double side){
        this.side = side;
    }
}
