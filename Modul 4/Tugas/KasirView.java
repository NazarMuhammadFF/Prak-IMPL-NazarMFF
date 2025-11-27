import java.util.Scanner;

public class KasirView {
    private final Scanner in = new Scanner(System.in);

    public void printProductInfo(String nama, int harga, int stok) {
        System.out.println("Nama Barang : " + nama);
        System.out.println("Harga Barang : " + harga);
        System.out.println("Stok Barang : " + stok);
    }

    public int getQuantity() {
        System.out.println("Transaksi Pembelian");
        System.out.print("Jumlah barang : ");
        return in.nextInt();
    }

    public void printPayment(int amount) {
        System.out.println("Jumlah Bayar : " + amount);
    }

    public void printOutOfStock() {
        System.out.println("Stok tidak cukup");
    }
}
