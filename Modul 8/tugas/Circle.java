public class Circle extends Shape {
    private double radius;
    private Point center; // composition: Circle "memiliki" Point center (bagian inti circle)

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circum() {
        return 2 * Math.PI * radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void draw(DrawingContext ctx) {
        /* gambar lingkaran */ }

    @Override
    public void erase(DrawingContext ctx) {
        /* hapus lingkaran */ }

    @Override
    public void move(int dx, int dy) {
        center.setX(center.getX() + dx);
        center.setY(center.getY() + dy);
    }

    @Override
    public void resize(double factor) {
        radius *= factor;
    }
}
