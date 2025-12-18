public class DrawingContext {
    private int verticalSize = 20;
    private int horizontalSize = 40;

    public void setPoint(int x, int y, char ch) {
        // simulasi gambar titik pada "canvas"
    }

    public void clearScreen() {
        // bersihkan canvas
    }

    public int getVerticalSize() {
        return verticalSize;
    }

    public int getHorizontalSize() {
        return horizontalSize;
    }

    public void setVerticalSize(int verticalSize) {
        this.verticalSize = verticalSize;
    }

    public void setHorizontalSize(int horizontalSize) {
        this.horizontalSize = horizontalSize;
    }
}
