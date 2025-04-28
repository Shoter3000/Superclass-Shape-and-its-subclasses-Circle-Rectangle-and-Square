public class TestShape {
    public static void main(String[] args) {
        //Shape
        Shape shape1 = new Shape();
        System.out.println(shape1);
        Shape shape2 = new Shape("blue", false);
        System.out.println(shape2);

        //Circle
        Circle circle1 = new Circle();
        System.out.println(circle1);
        Circle circle2 = new Circle(2.5, "yellow", true);
        System.out.println(circle2);
        System.out.println("Area of circle2: " + circle2.getArea());
        System.out.println("Perimeter of circle2: " + circle2.getPerimeter());

        //Rectangle
        Rectangle rect1 = new Rectangle();
        System.out.println(rect1);
        Rectangle rect2 = new Rectangle(2.0, 4.0, "purple", false);
        System.out.println(rect2);
        System.out.println("Area of rect2: " + rect2.getArea());
        System.out.println("Perimeter of rect2: " + rect2.getPerimeter());

        //Square
        Square square1 = new Square();
        System.out.println(square1);
        Square square2 = new Square(5.0, "black", true);
        System.out.println(square2);
        System.out.println("Area of square2: " + square2.getArea());
        System.out.println("Perimeter of square2: " + square2.getPerimeter());

        //setSide()
        square2.setSide(7.0);
        System.out.println("After setting side to 7.0: " + square2);
    }
}
