/* Nama File    : MGaris.java
 * Deskripsi    : Kelas Garis merepresentasikan Garis yang memiliki 2 titik
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 26 Februari 2025 */

public class MGaris {
    public static void main(String[] args) {
        Garis G1 = new Garis();
        G1.setAwal(new Titik(0,1));
        G1.setAkhir(new Titik(1, 3));
        System.out.println("==Garis G1==");
        G1.printGaris();

        Titik A = new Titik(0, 4 );
        Titik B = new Titik(2, 3);
        Garis G2 = new Garis(A,B);
        System.out.println("==Garis G2==");
        G2.printGaris();

        System.out.println("\nCounter Garis = " + Garis.getCounterGaris());
        System.out.println("Panjang Garis G1 = " + G1.panjangGaris());
        System.out.println("Panjang Garis G2 = " + G2.panjangGaris());
        System.out.println("Gradien Garis G1 = " + G1.getGradien());
        Titik tengah = G2.getTitikTengah();
        System.out.println("Titik Tengah Garis G2 =  " );
        tengah.printTitik();


        System.out.println("G1 sejajar G2? " + G1.isSejajar(G2));
        System.out.println("G1 tegak lurus G2? " + G1.isTegakLurus(G2));
        G1.persamaanGaris();
        G2.persamaanGaris();



        

    }
}
