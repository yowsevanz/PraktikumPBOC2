/* Nama File    : Kembangtelon.java
 * Deskripsi    : Kelas Kembangtelon adalah turunan dari kelas kucing
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 30 April 2026 */

public class KembangTelon extends Kucing{
    /*METHOD */
    public KembangTelon(String nama, double bobot){
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
