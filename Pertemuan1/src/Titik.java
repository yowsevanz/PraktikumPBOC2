/* Nama File    : Titik.java
 * Deskripsi    : Kelas Titik merepresentasikan titik 2 dimensi pada bidang kartesius
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 19 Februari 2025 */


public class Titik {
    double absis;
    double ordinat;


    Titik(){
        absis = 0;
        ordinat = 0;
    }


    double getAbsis(){
        return absis;
    }


    double getOrdinat(){
        return ordinat;
    }


    void setAbsis(double x){
        absis = x;
    }


    void setOrdinat(double y){
        ordinat = y;
    }


    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }


    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
}


  







