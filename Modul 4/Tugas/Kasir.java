public class Kasir {
    public static void main(String[] args) {
        // Initialize model with product data
        KasirModel model = new KasirModel("GeForce GTX 1060Ti", 3000, 10);
        KasirView view = new KasirView();
        KasirController controller = new KasirController(model, view);

        // Show initial product info
        controller.updateView();

        // Process purchase flow
        controller.processPurchase();
    }
}