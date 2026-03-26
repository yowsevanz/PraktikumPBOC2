/* Nama File    : MBangunDatar.java
 * Deskripsi    : Main untuk realisasi dari kelas-kelas Bangun Datar, Persegi dan Lingkaran
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 12 Maret 2026 */

public class MBangunDatar {
    /* REALISASI */
    public static void main(String[] args) {
        System.out.println("====== REALISASI BANGUN DATAR ======");
        // BangunDatar BD1 = new BangunDatar();
        BangunDatar P0 = new Persegi(5, "Merah", "Putih");
        Persegi P1 = new Persegi(4, "Hitam", "Putih");
        P0.printInfo();
        P1.printInfo();
        System.out.println("Luas P0 = "+P0.getLuas());
        System.out.println("Luas P1 "+ P1.getLuas());
        System.out.println("Luas P0 == P1? " + P0.isEqualLuas(P1));

        System.out.println("Keliling P0 == P1? " + P0.isEqualKeliling(P1));

        System.out.println("Sisi Persegi P0 sblm IResize = " + ((Persegi)P0).getSisi());
        ((Persegi)P0).zoomIn();
        System.out.println("Sisi Persegi P0 IResize xoomIn= " + ((Persegi)P0).getSisi());


        System.out.println("Sisi Persegi P0 sblm IResize = " + ((Persegi)P0).getSisi());
        ((Persegi)P0).zoomOut();
        System.out.println("Sisi Persegi P0 IResize zoomOut = " + ((Persegi)P0).getSisi());
    
        
        
    }
}
