/* Nama File    : MMahasiswa.java
 * Deskripsi    : Kelas Main Mahasiswa yang berisi realisasi dari kelas Mahasiswa
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 23 April 2026 */

public class MMahasiswa {
    public static void main(String[] args) {
        /* REALISASI */
        Mahasiswa M1 = new Mahasiswa(); 
        Mahasiswa M2 = new Mahasiswa("216899", "Budi", "Informatika");
        Mahasiswa M3 = new Mahasiswa(M2); //M3 adalah objek hasil kloning objek Mahasiswa M2
        Mahasiswa M4 = new Mahasiswa("24118", "Tono", "Teknik Informatika");

        M1.PrintMahasiswa();
        M2.PrintMahasiswa();
        M3.PrintMahasiswa();
        M3.setProgramStudi(M4); // Mengganti Programstudi M3 menjadi seperti pada objek M4
        M3.PrintMahasiswa();
        M4.PrintMahasiswa();

        System.out.println("\nNama Mahasiswa M3 : " + M3.getNama());
        System.out.println("NIM Mahasiswa M4  : " + M4.getNim());
        System.out.println("Program Studi Mahasiswa M2  : " + M2.getProgramStudi());

        M1.setNama("Zenara");
        M1.setNim("2413356");
        M1.setProgramStudi("Forensic Digital");
        M1.PrintMahasiswa();

        

        




    }
}
