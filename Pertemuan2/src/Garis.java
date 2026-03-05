/* Nama File    : Garis.java
 * Deskripsi    : Kelas Garis merepresentasikan Garis yang memiliki 2 titik
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 26 Februari 2025 */

public class Garis {
    Titik awal;
    Titik akhir;
    static int counterGaris;


    Garis(Titik A, Titik B){
        awal = A;
        akhir = B;
        counterGaris++;
    }

    Garis (){
        this(new Titik(0,0), new Titik(1,1));
    }

    Titik getAwal(){
        return awal;
    }

    Titik getAkhir(){
        return akhir;
    }

    static int getCounterGaris(){
        return counterGaris;
    }

    void setAwal(Titik A){
        awal = A;
    }

    void setAkhir(Titik B){
        akhir = B;
    }

    double panjangGaris(){
        return awal.getJarak(akhir);
    }

    double getGradien(){
        return (akhir.getOrdinat()-awal.getOrdinat())/(akhir.getAbsis()-awal.getAbsis());

    }

    Titik getTitikTengah(){
        Titik tengah = new Titik();
        tengah.setAbsis((akhir.getAbsis()+awal.getAbsis())/2);
        tengah.setOrdinat((akhir.getOrdinat()+awal.getOrdinat())/2);
        return tengah;
    }

    boolean isSejajar(Garis G){
        return this.getGradien() == G.getGradien();

    }

    boolean isTegakLurus(Garis G){
        return this.getGradien()*G.getGradien() == -1;
    }

    void printGaris(){
        System.out.println("Titik awal ("+ getAwal().getAbsis() + "," + getAwal().getOrdinat() + ")");
        System.out.println("Titik akhir ("+ getAkhir().getAbsis() + "," + getAkhir().getOrdinat() + ")");
    }

    void persamaanGaris(){
        double m = getGradien();
        double c = awal.getOrdinat()-m*awal.getAbsis();
        System.out.println("y = " + m + "x + " + c);
    }
}
