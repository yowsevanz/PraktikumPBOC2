/* Nama File    : MPegawai.java
 * Deskripsi    : Kelas MPegawai untuk realisasi dari kelas-kelas Dosen Tetap, Dosen Tamu dan Tendik.
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 12 Maret 2026 */

import java.time.LocalDate;

public class MPegawai {
    /* REALISASI */
     public static void main(String[] args) {
      DosenTetap D1 = new DosenTetap();
      DosenTamu DT2 = new DosenTamu();
      Tendik T1     = new Tendik();

  
      System.out.println("====== REALISASI DOSEN TETAP =====");
      D1.setNip("9545647548");
      D1.setNidn("78647324");
      D1.setNama("Andi");
      D1.setTanggallahir(LocalDate.parse("1990-05-05"));
      D1.setTmt(LocalDate.parse("2015-01-01"));
      D1.setFakultas("Fakultas Sains dan Matematika");
      D1.setGajipokok(5000000);
      D1.printInfo();

      
      
      System.out.println("\n====== REALISASI DOSEN TAMU =====");

      DT2.setNip("9445647233");
      DT2.setNidk("12647388");
      DT2.setNama("Dita");
      DT2.setTanggallahir(LocalDate.parse("1995-02-17"));
      DT2.setTmt(LocalDate.parse("2025-01-13"));
      DT2.setFakultas("Fakultas Sains dan Matematika");
      DT2.setGajipokok(4000000);
      DT2.setTglAkhirKontrak("2027-07-13");
      DT2.printInfo();


      System.out.println("\n====== REALISASI TENDIK =====");
      T1.setNip("3245647119");
      T1.setNama("Tio");
      T1.setTanggallahir(LocalDate.parse("1985-04-02"));
      T1.setTmt(LocalDate.parse("2011-07-23"));
      T1.setBidang("Sumber Daya");
      T1.setGajipokok(4000000);
      T1.printInfo();
    }
}
