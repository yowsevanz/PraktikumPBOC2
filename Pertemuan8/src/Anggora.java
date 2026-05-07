/* Nama File    : Anggora.java
 * Deskripsi    : Kelas Anggora yang merupakan turunan dari kelas Kucing 
 * Tanggal      : 30 April 2026 */

public class Anggora extends Kucing{
    /* Method */
    //Konstruktor
    public Anggora(String nama, double bobot){
        super(nama, bobot);
    }


    @Override
    public void Gerak(){
        System.out.println("Kucing " + getNama() + " lincah melompat");
    }

    public void Bersuara(){
        System.out.println("Kucing " + getNama() + " bersuara: Meong lembut");
    }
}
