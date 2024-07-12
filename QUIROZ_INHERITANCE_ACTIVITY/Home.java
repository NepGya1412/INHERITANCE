class Home{

    public void displayCircleCylinder(){
        lines();
        Circle circle = new Circle("Red", "Smooth", 5.0);
        circle.draw();
        System.out.println("Area of the circle: " + circle.getArea() + '\n');

        Cylinder cylinder = new Cylinder("Blue", "Rough", 3.0, 7.0);
        cylinder.draw();
        System.out.println("Surface area of the cylinder: " + cylinder.getArea());
        System.out.println("Volume of the cylinder: " + cylinder.calculateVolume());
        lines();
    }    
    
    public void displayRectangleBox(){
        Rectangle rectangle = new Rectangle("Blue", "Rough", 12.0, 7.0);
        rectangle.draw();
        System.out.println("Area of the Rectangle: " + rectangle.getArea() + '\n');

        Box box = new Box("Yellow", "Smooth", 3.0, 10.0, 5.0);
        box.draw();
        System.out.println("Surface area of the Box: " + box.getArea());
        System.out.println("Volume of the Box: " + box.calculateVolume());
        lines();
    }    
    public void displayTriPyra(){
        Triangle triangle = new Triangle("Green", "Smooth", 6.0, 6.0);
        triangle.draw();
        System.out.println("Area of the Triangle: " + triangle.getArea() + '\n');

        Pyramid pyramid = new Pyramid("Light Blue", "Rough", 5.0, 5.0, 5.0);
        pyramid.draw();
        System.out.println("Surface area of the Pyramid: " + pyramid.getArea());
        System.out.println("Volume of the Pyramid: " + pyramid.calculateVolume());
        lines();
    }
       public void displaySqCube(){
        Square square = new Square("Blue", "Smooth", 5.0);
        square.draw();
        System.out.println("Area of the Square: " + square.getArea() + '\n');

        Cube cube = new Cube("Dark Blue", "Rough", 5.0);
        cube.draw();
        System.out.println("Surface area of the Cube: " + cube.getArea());
        System.out.println("Volume of the Cube: " + cube.calculateVolume());
        lines();
    }  

    public void lines(){
       for (int i = 0; i < 50; i++) {
            System.out.print("*");
       }
       System.err.println("");
    }
}