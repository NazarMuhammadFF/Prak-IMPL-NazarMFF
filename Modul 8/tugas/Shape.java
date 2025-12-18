public abstract class Shape {
    public abstract void draw(DrawingContext ctx);

    public abstract void erase(DrawingContext ctx);

    public abstract void move(int dx, int dy);

    public abstract void resize(double factor);
}
