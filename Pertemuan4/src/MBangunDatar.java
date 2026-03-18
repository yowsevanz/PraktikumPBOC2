/* Nama File    : MBangunDatar.java
 * Deskripsi    : Main untuk realisasi dari kelas-kelas Bangun Datar, Persegi dan Lingkaran
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 12 Maret 2026 */

public class MBangunDatar {
    public static void main(String[] args) {
    

        System.out.println("====== REALISASI PERSEGI ======");
        Persegi P1 = new Persegi(10, "putih", "hitam");
        P1.printInfo();
        System.out.println("Keliling P1 = "+P1.getKeliling());
        System.out.println("Luas P1     = "+P1.getLuas());
        System.out.println("Diagonal P1 = "+P1.getDiagonal());
        

        System.out.println("\n====== REALISASI LINGKARAN ======");
        Lingkaran L1 = new Lingkaran(10, "merah", "putih");
        L1.printInfo();
        System.out.println("Jari-jari L1 = "+L1.getJari());
        System.out.println("Keliling L1  = "+L1.getKeliling());
        System.out.println("Luas L1      = "+L1.getLuas());

        System.out.println("\n== REALISASI COUNTER BANGUN DATAR ==");
        BangunDatar.printCounterBangunDatar(); // Realisasi Counter Bangun Datar

        


        
    }
}
