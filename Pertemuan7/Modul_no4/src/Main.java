/* Nama File    : Main.java
 * Deskripsi    : Kelas Main berisi implementasi kelas CivitasAkademika dan turunannya
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 23 April 2026 */
public class Main {
    /* REALISASI */
    public static void main(String[] args) {
        CivitasAkademika D1 = new Dosen();
        CivitasAkademika D2 = new Dosen("Tanu", "91819973");
        CivitasAkademika MHS1 = new Mahasiswa();
        CivitasAkademika MHS2 = new Mahasiswa("Steve", "2412011910", (Dosen) D1);
        CivitasAkademika MHS3 = new Mahasiswa("James", "2217659144", (Dosen) D2);

        D1.setNama("Danu");
        ((Dosen)D1).setNomor("781651002");

        MHS1.setNama("Michelle");
        ((Mahasiswa)MHS1).setNomor("23197654877");
        ((Mahasiswa)MHS1).setWali((Dosen)D2);

        Seminar S1 = new Seminar();
        S1.registrasi((Mahasiswa)MHS3);
        S1.registrasi((Mahasiswa)MHS2);
        S1.registrasi((Mahasiswa)MHS1);
        S1.registrasi(D2);
        S1.registrasi(D1);

        ((Mahasiswa)MHS1).tampilDataMahasiswa();
        // c.
        System.out.println("Banyaknya Peserta Seminar = " + S1.countPeserta());
        // g.
        S1.tampilPeserta();
        // h.
        System.out.println("Banyaknya Peserta Seminar Mahasiswa = " + S1.countMahasiswa());
        // i.
        ((Mahasiswa)MHS1).setWali((Dosen)D2);
        // j.
        ((Mahasiswa)MHS1).tampilDataMahasiswa();






    }
}
