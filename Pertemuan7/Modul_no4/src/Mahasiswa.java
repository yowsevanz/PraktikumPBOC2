/* Nama File    : Mahasiswa.java
 * Deskripsi    : Kelas Mahasiswa merupakan kelas turunan dari CivitasAkademika dan sudah merealisasikan fungsi getNomor dengan Nim
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 23 April 2026 */

public class Mahasiswa extends CivitasAkademika{
    /* ATRIBUT */
    private String Nim;
    private Dosen DosenWali;

    /* METHOD */

    // Konstruktor
    public Mahasiswa(){

    }

    public Mahasiswa(String Nama, String Nim, Dosen DosenWali){
        super(Nama);
        this.Nim = Nim;
        this.DosenWali = DosenWali;
    }

    //Selektor
    public String getNomor(){
        return Nim;
    }

    public Dosen getWali(){
        return DosenWali;
    }

    //Mutator
    public void setNomor(String Nim){
        this.Nim = Nim;
    }

    public void setWali(Dosen DosenWali){
        this.DosenWali = DosenWali;
    }


    //Method yang menampilkan data Mahasiswa
    public void tampilDataMahasiswa(){
        System.out.println("NIM Mahasiswa     : " + this.getNomor());
        System.out.println("Nama Mahasiswa    : " + this.getNama());
        System.out.println("Nama DosenWali    : " + this.getWali().getNama());
    }






}
