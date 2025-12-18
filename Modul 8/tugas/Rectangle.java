public class Rectangle extends Shape {
    private Point topLeft;
    private int width;
    private int height;

    public Rectangle(Point topLeft, int width, int height) {
        this.topLeft = topLeft;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(DrawingContext ctx) {
        /* gambar persegi panjang */ }

    @Override
    public void erase(DrawingContext ctx) {
        /* hapus */ }

    @Override
    public void move(int dx, int dy) {
        topLeft.setX(topLeft.getX() + dx);
        topLeft.setY(topLeft.getY() + dy);
    }

    @Override
    public void resize(double factor) {
        width = (int) Math.round(width * factor);
        height = (int) Math.round(height * factor);
    }
}
