import java.util.ArrayList;
import java.util.List;

public class Polygon extends Shape {
    private final List<Point> points = new ArrayList<>();

    public void addPoint(Point p) {
        if (p != null)
            points.add(p);
    }

    @Override
    public void draw(DrawingContext ctx) {
        /* gambar polygon */ }

    @Override
    public void erase(DrawingContext ctx) {
        /* hapus */ }

    @Override
    public void move(int dx, int dy) {
        for (Point p : points) {
            p.setX(p.getX() + dx);
            p.setY(p.getY() + dy);
        }
    }

    @Override
    public void resize(double factor) {
        // implementasi sederhana: scale relatif terhadap (0,0)
        for (Point p : points) {
            p.setX((int) Math.round(p.getX() * factor));
            p.setY((int) Math.round(p.getY() * factor));
        }
    }
}
