/* Nama File    : CivitasAkademik.java
 * Deskripsi    : Kelas abstrak CivitasAkademik memiliki atribut Nama dan fungsi abstrak getNomor
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 23 April 2026 */

public abstract class CivitasAkademika {
    /* ATRIBUT */
    private String Nama;

    /* METHOD */

    // Konstruktor
    public CivitasAkademika(){
        
    }

    public CivitasAkademika(String Nama){
        this.Nama = Nama;
    }

    //Selektor
    public String getNama(){
        return Nama;
    }

    //Mutator
    public void setNama(String Nama){
        this.Nama = Nama;
    }

    //abstract method
    public abstract String getNomor();


}
