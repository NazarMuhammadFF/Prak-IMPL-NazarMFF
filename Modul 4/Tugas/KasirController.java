public class KasirController {
    private KasirModel model;
    private KasirView view;

    public KasirController(KasirModel model, KasirView view) {
        this.model = model;
        this.view = view;
    }

    public void setProduct(String nama, int harga, int stok) {
        model.setNama(nama);
        model.setHarga(harga);
        model.setStok(stok);
    }

    public void updateView() {
        view.printProductInfo(model.getNama(), model.getHarga(), model.getStok());
    }

    public void processPurchase() {
        int qty = view.getQuantity();
        if (model.purchase(qty)) {
            int total = model.getTotalPrice(qty);
            view.printPayment(total);
            updateView();
        } else {
            view.printOutOfStock();
        }
    }
}
