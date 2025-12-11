<?php
session_start();
$conn = mysqli_connect("localhost", "root", "", "db_pesan");

// ======================= FUNGSI HAPUS =======================
if (isset($_GET['hapus'])) {
    $id = $_GET['hapus'];
    $sql = "DELETE FROM pesan WHERE idPesan = $id";
    $res = mysqli_query($conn, $sql);
    if ($res) {
        echo "Pesan berhasil dihapus<br><br>";
        echo "<a href='TampilPesan.php'>Kembali ke Daftar Pesan</a>";
    } else {
        echo "Gagal menghapus pesan. Error: " . mysqli_error($conn) . "<br><br>";
    }
} else {
    echo "ID pesan tidak ditemukan.<br><br>";
    echo "<a href='TampilPesan.php'>Kembali ke Daftar Pesan</a>";
}
