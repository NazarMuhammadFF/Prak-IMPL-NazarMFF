// File: ListOfNumbers2.java
import java.io.*;
import java.util.Vector;

public class ListOfNumbers2 {

    private Vector<Integer> vector;
    private static final int SIZE = 10;

    public ListOfNumbers2() {
        vector = new Vector<>(SIZE);

        for (int i = 0; i < SIZE; i++) {
            vector.add(i);
        }

        readList("infile.txt");
        writeList();
    }

    public void readList(String fileName) {
        String line = null;
        RandomAccessFile raf = null;

        try {
            raf = new RandomAccessFile(fileName, "r");

            while ((line = raf.readLine()) != null) {
                try {
                    Integer value = Integer.parseInt(line.trim());
                    System.out.println(value);
                    vector.add(value);
                } catch (NumberFormatException e) {
                    System.err.println("Format angka tidak valid: " + line);
                }
            }

        } catch (FileNotFoundException e) {
            System.err.println("File tidak ditemukan: " + fileName);

        } catch (IOException e) {
            System.err.println("Error saat membaca file: " + e.getMessage());

        } finally {
            if (raf != null) {
                try {
                    raf.close();
                } catch (IOException e) {
                    System.err.println("Gagal menutup file.");
                }
            }
        }
    }

    public void writeList() {
        PrintWriter out = null;

        try {
            out = new PrintWriter(new FileWriter("outfile.txt"));

            for (int i = 0; i < vector.size(); i++) {
                try {
                    out.println("Value at: " + i + " = " + vector.elementAt(i));
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.err.println("Indeks melebihi batas: " + i);
                }
            }

        } catch (IOException e) {
            System.err.println("Error saat menulis file: " + e.getMessage());

        } finally {
            if (out != null) {
                out.close();
                System.out.println("Closing PrintWriter...");
            } else {
                System.out.println("PrintWriter tidak dibuat.");
            }
        }
    }

    public static void main(String[] args) {
        new ListOfNumbers2();
    }
}
