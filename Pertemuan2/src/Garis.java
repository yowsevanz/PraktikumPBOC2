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


}
