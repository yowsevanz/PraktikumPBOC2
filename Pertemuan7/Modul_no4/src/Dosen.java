/* Nama File    : Dosen.java
 * Deskripsi    : Kelas Dosen merupakan turunan dari kelas Civitas Akademika yang sudah merealisasikan fungsi getNomor dengan mengembalikan Nip
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 23 April 2026 */
public class Dosen extends CivitasAkademika{
    /* ATRIBUT */
    private String Nip;

    /* METHOD */

    // Konstruktor
    public Dosen(){
        
    }

    public Dosen(String Nama, String Nip){
        super(Nama);
        this.Nip = Nip;
    }


    //Selektor
    public String getNomor(){
        return Nip;
    }


    //Mutator
    public void setNomor(String Nip){
        this.Nip = Nip;
    }



}
