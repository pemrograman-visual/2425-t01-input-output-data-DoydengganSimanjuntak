// 12S24056-Enjel Ayuti Napitupulu
// 12S24033-Doy Denggan Simanjuntak

import java.util.*;
import java.lang.Math;

public class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN;

        iSBN = input.nextLine();
        String judul;

        judul = input.nextLine();
        String penulis;

        penulis = input.nextLine();
        int tahunTerbit;

        tahunTerbit = input.nextInt();
        String penerbit;

        penerbit = input.nextLine();
        String formatBuku;

        formatBuku = input.nextLine();
        double harga;

        harga = input.nextDouble();
        double margin;

        margin = input.nextDouble();
        int stok;

        stok = input.nextInt();
        double rating;

        rating = input.nextDouble();
        System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahunTerbit + "|" + penerbit + "|" + formatBuku + "|" + harga + "|" + margin + "|" + stok + "|" + rating);
    }
}
