/* Nama File    : Titik.java
 * Deskripsi    : Kelas Titik merepresentasikan titik 2 dimensi pada bidang kartesius
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 26 Februari 2025 */



public class Titik {
    double absis;
    double ordinat;
    static int counterTitik = 0;


    Titik(){
        this(0,0);
        counterTitik++;
    }

    static int getCounterTitik(){
        return counterTitik;
    }

    Titik(double x, double y){
        absis = x;
        ordinat = y;


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

    int getKuadran() {
        
        if (absis > 0 && ordinat > 0) {
            return 1;
        } else if (absis < 0 && ordinat > 0 ){
            return 2;
        } else if (absis < 0 && ordinat < 0){
            return 3;
        } else if (absis > 0 && ordinat < 0){
            return 4;
        } else {
            return 0;
        }
    }

    double getJarakPusat(){
        return Math.sqrt(absis*absis+ordinat*ordinat);
    }

    void refleksiX(){
        ordinat = ordinat*(-1);
    }

    void refleksiY(){
        absis = absis*(-1);
    }

    Titik getRefleksiX(){
       return new Titik(absis, ordinat*(-1));
    }






}


  







