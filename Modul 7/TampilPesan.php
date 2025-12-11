<?php
session_start();
$conn = mysqli_connect("localhost", "root", "", "db_pesan");
?>

<h3>Daftar Pesan:</h3>

<table border="1" cellpadding="5" cellspacing="0">
    <tr>
        <th>idPesan</th>
        <th>idPengirim</th>
        <th>idPenerima</th>
        <th>Judul</th>
        <th>Pesan</th>
        <th>Waktu</th>
        <th>Aksi</th>
    </tr>

    <?php
    $q = mysqli_query($conn, "SELECT * FROM pesan ORDER BY idPesan DESC");
    while ($row = mysqli_fetch_assoc($q)) {
        echo "<tr>";
        echo "<td>" . $row['idPesan'] . "</td>";
        echo "<td>" . $row['idPengirim'] . "</td>";
        echo "<td>" . $row['idPenerima'] . "</td>";
        echo "<td>" . $row['Judul'] . "</td>";
        echo "<td>" . $row['TextPesan'] . "</td>";
        echo "<td>" . $row['WktPesan'] . "</td>";
        echo "<td><a href='HapusPesan.php?hapus=" . $row['idPesan'] . "' onclick='return confirm(\"Apakah Anda yakin ingin menghapus pesan ini?\")'>Hapus</a></td>";
        echo "</tr>";
    }
    ?>
</table>

<br>
<a href="Form_TambahPesan.php">Tambah Pesan Baru</a>