/* Nama File    : Seminar.java
 * Deskripsi    : Kelas Seminar adalah kelas aplikator yang memiliki atribut array statis berukuran 100 bernama peserta yang berisi peserta seminar
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 23 April 2026 */

public class Seminar {
    /* ATRIBUT */
    private CivitasAkademika[] pesertas =  new CivitasAkademika[100];
    private int banyakPeserta;

    /* METHOD */

    // Konstruktor
    public Seminar(){
        banyakPeserta = 0;

    }

    public Seminar(int banyakPeserta){
        this.banyakPeserta = banyakPeserta;

    }

    public CivitasAkademika[] getPesertas(){
        return pesertas;
    }

    //Selektor
    public int getBanyakPeserta(){
        return banyakPeserta;
    }

    //Mutator
    public void setBanyakPeserta(int banyakPeserta){
        this.banyakPeserta = banyakPeserta;
    }


    //Method lainnya
    public int countPeserta(){
        return banyakPeserta;
    }


    
    public void registrasi(CivitasAkademika C){
        if (banyakPeserta < 100){
            pesertas[banyakPeserta] = C;
            banyakPeserta++;
        } else {
            System.out.println("Peserta Penuh");
        }

    }

    // h. Menghitung banyaknya peserta mahasiswa menggunakan instanceof. 
    public int countMahasiswa(){
        int jumlahMhs = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa) {
                jumlahMhs++;
            }
        }
        return jumlahMhs;
    }

    // g. prosedur tampilPeserta untuk menampilkan daftar Nomor dan Nama semua peserta seminar
    public void tampilPeserta(){
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.print(pesertas[i].getNama() + "(" + pesertas[i].getNomor()+")");
            if (i!=banyakPeserta-1) {
                System.out.print(", ");
            }
        }
    }

}
