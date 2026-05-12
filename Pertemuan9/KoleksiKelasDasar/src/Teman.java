/* Nama File    : Teman.java
 * Deskripsi    : Kelas Teman yang merepresentasikan daftar teman
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 7 Mei 2026 */
import java.util.ArrayList;
public class Teman {
    /* ATRIBUT */
    private ArrayList<String> Lnama;
    private int nbelm;

    /* METHOD */

    //Konstruktor
    public Teman(){
        Lnama = new ArrayList<>();
        nbelm = 0;

    }

    // Selektor
    // a. getNbelm()
    public int getNbelm(){
        return nbelm;
    }

    //b. getNama(indeks)
    public String getNama(int indeks){
        return Lnama.get(indeks);
    }

    // Mutator
    //c. setNama(indeks, nama)
    public void setNama(int indeks, String Nama){
        Lnama.set(indeks, Nama);
    }

    //METHOD lainnya
    //d. addNama(nama)
    public void addNama(String nama){
        Lnama.add(nama);
        nbelm++;
    }

    //e. delNama(nama)
    public void delNama(String nama){
        if(Lnama.contains(nama)){
            Lnama.remove(nama);
            nbelm--;
        }
    }

   //f. isMember(nama)
    public boolean isMember(String nama){
        return Lnama.contains(nama);
    }

   //g. gantiNama(nama, namaBaru)
    public void gantiNama(String nama, String namaBaru){
        int index = Lnama.indexOf(nama);
        if (index!=(-1)) {
            Lnama.set(index, namaBaru);
        }
    }

   //h. countNama(nama)
   public int countNama(String nama){
        int count = 0;
        for (int i = 0; i < nbelm; i++) {
            if (nama == getNama(i)) {
                count++;
            }
        }
        return count;

    }

    //i. showNama
    public void showNama(){
        for (int i = 0; i < nbelm; i++) {
            System.out.print(getNama(i));
            if (i>-1 && i<nbelm-1) {
                System.out.print(", ");
            }
        }
    }





    



   
}
