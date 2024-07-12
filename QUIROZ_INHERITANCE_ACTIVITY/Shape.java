public abstract class Shape {
    private String color;
    private String texture;

    public Shape(String color, String texture) {
        this.color = color;
        this.texture = texture;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public abstract void draw();
}
