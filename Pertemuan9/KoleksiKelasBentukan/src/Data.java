/* Nama File    : Data.java
 * Deskripsi    : Kelas Data yang merupakan Kelas generik untuk menyimpan dan mengelola kumpulan data
 *                dalam array dengan kapasitas tetap
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 30 April 2026 */

import java.util.Arrays;

public class Data <T> {
    /* ATRIBUT */
    private static final int kapasitas = 100;
    private final T ruang[];
    private int banyak;

    /* METHOD */

    //Konstruktor
    public Data(T[] contohRuang){
        this.ruang = Arrays.copyOf(contohRuang, kapasitas);
        this.banyak = 0;
    }

    //Selektor
    public T getIsi(int posisi){
        if (posisi < 1 || posisi > kapasitas ) {
            return null;
        }
        return ruang[posisi-1];
    }

    public int getSize(){
        return this.banyak;
    }
    //Mutator
    public void setIsi(int posisi, T objek){
        if (ruang[posisi-1] == null) {
            banyak++;
        }
        ruang[posisi-1] = objek;
    }

    

    


}
