public class Rectangle extends Shape {
    private double width,length;

    public Rectangle(String color, String texture, double width, double length) {
        super(color, texture);
        this.width = width;
        this.length = length;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle with a color of " + getColor() + ", while having a " + getTexture() + " texture");
        System.out.println("The Rectangle has a length of " + getLength() + " and a width of " + getWidth());
    }

    public double getArea(){
        return length * width;
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    public void setlength(double length){
        this.length = length;
    }

    public void setWidth(double width){
        this.width = width;
    }
}
