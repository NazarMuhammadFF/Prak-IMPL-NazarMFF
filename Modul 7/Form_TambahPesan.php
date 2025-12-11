<!DOCTYPE html>
<html>

<head>
    <title>Tambah Pesan</title>
</head>

<body>
    <h1>Form Isi Pesan</h1>
    <form action="SimpanPesan.php" method="post">

        <input type="text" name="Penerima" placeholder="ID Penerima"><br><br>

        <input type="text" name="judul" placeholder="Judul Pesan"><br><br>

        <textarea name="TextPesan" placeholder="Isi Pesan"></textarea><br><br>

        <input type="submit" name="submit" value="Simpan">
    </form>

    <br>
    <a href="TampilPesan.php">Lihat Daftar Pesan</a>

</body>

</html>