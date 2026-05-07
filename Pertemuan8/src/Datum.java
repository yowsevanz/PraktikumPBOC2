/* Nama File    : Datum.java
 * Deskripsi    : Kelas Datum yang merupakan Kelas generik untuk menyimpan satu objek bertipe T
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 30 April 2026 */

public class Datum<T> {
    /* ATRIBUT */
    private T isi;

    /* METHOD */

    //Konstruktor
    public Datum(T isi){
        this.isi = isi;
    }

    //Selektor
    public T getIsi(){
        return isi;
    }

    //Mutator
    public void setIsi(T isibaru){
        this.isi = isibaru;
    }


    public void tampilkanAnabul(Anabul anabul){
        anabul.Gerak();
        anabul.Bersuara();

        if (anabul instanceof Kucing) {
            ((Kucing) anabul).printBobot();
        }
    }
}

