public class Main {
    public static void main(String[] args) {
        // Create some shapes
        Point center = new Point(0, 0);
        Circle circle = new Circle(center, 5.0);

        Point topLeft = new Point(10, 10);
        Rectangle rectangle = new Rectangle(topLeft, 20, 10);

        Polygon polygon = new Polygon();
        polygon.addPoint(new Point(0, 0));
        polygon.addPoint(new Point(5, 0));
        polygon.addPoint(new Point(5, 5));

        // Create a window
        Window window = new ConsoleWindow();
        window.setFrame(new Frame("My Window"));
        window.addShape(circle);
        window.addShape(rectangle);
        window.addShape(polygon);

        // Create drawing context
        DrawingContext ctx = new DrawingContext();

        // Display the window
        window.display(ctx);

        System.out.println("Window displayed with shapes.");
    }
}