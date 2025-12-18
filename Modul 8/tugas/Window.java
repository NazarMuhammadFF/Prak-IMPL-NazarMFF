import java.util.ArrayList;
import java.util.List;

public class Window {
    private Frame frame; // aggregation: Window "punya" Frame (bisa hidup terpisah)
    private final List<Shape> shapes; // aggregation: Window menampung banyak Shape

    public Window() {
        this.shapes = new ArrayList<>();
    }

    public void setFrame(Frame frame) {
        this.frame = frame;
    }

    public Frame getFrame() {
        return frame;
    }

    public void addShape(Shape shape) {
        if (shape != null)
            shapes.add(shape);
    }

    public List<Shape> getShapes() {
        return shapes;
    }

    public void open() {
        /* open window */ }

    public void close() {
        /* close window */ }

    public void move(int x, int y) {
        /* move window position */ }

    public void display(DrawingContext ctx) {
        // tampilkan semua shape
        for (Shape s : shapes)
            s.draw(ctx);
    }

    // dependency: Window "menggunakan" Event
    public void handleEvent(Event event) {
        // routing event sederhana
        if (event == null)
            return;
        // contoh: event type "REDRAW" -> display ulang, dll
    }
}
