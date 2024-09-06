// 12S24056-Enjel Ayuti Napitupulu
// 12S24033-Doy Denggan Simanjuntak

import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN;

        iSBN = input.nextLine();
        String judul;

        judul = input.nextLine();
        String penulis;

        penulis = input.nextLine();
        int tahunTerbit;

        tahunTerbit = Integer.parseInt(input.nextLine());
        String penerbit;

        penerbit = input.nextLine();
        String formatBuku;

        formatBuku = input.nextLine();
        double harga;

        harga = Double.parseDouble(input.nextLine());
        double margin;

        margin = Double.parseDouble(input.nextLine());
        int stok;

        stok = Integer.parseInt(input.nextLine());
        double rating;

        rating = Double.parseDouble(input.nextLine());
        System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahunTerbit + "|" + penerbit + "|" + formatBuku + "|" + harga + "|" + margin + "|" + stok + "|" + rating);
    }
}
