<?php
session_start();
$conn = mysqli_connect("localhost", "root", "", "db_pesan");

// CEGAH ERROR KALAU DI-ACCESS TANPA FORM
if (!isset($_POST['Penerima']) || !isset($_POST['judul']) || !isset($_POST['TextPesan'])) {
    echo "Form belum disubmit. <br><br>";
    echo "<a href='Form_TambahPesan.php'>Kembali ke Form</a>";
} else {

    $idPengirim = isset($_SESSION['id']) ? $_SESSION['id'] : 1;
    $idPenerima = $_POST['Penerima'];
    $judul      = $_POST['judul'];
    $TextPesan  = $_POST['TextPesan'];
    $date       = date('Y-m-d H:i:s');
    $sql = "INSERT INTO pesan (idPengirim, idPenerima, Judul, TextPesan, WktPesan) 
        VALUES ('$idPengirim', '$idPenerima', '$judul', '$TextPesan', '$date')";
    $res = mysqli_query($conn, $sql);
    if ($res) {
        echo "Pesan berhasil ditambahkan<br><br>";
        echo "<a href='TampilPesan.php'>Lihat Daftar Pesan</a>";
    } else {
        echo "Pesan gagal ditambahkan. Error: " . mysqli_error($conn) . "<br><br>";
        echo "<a href='Form_TambahPesan.php'>Kembali ke Form</a>";
    }
}
