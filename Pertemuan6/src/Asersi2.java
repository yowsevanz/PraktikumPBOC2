/* Nama File    : Asersi2.java
 * Deskripsi    : Penggunaan asersi untuk memvalidasi bahwa nilai jari-jari pada kelas Lingkaran tidak boleh nol
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 26 Maret 2026 */
class  Lingkaran {
    /* ATRIBUT */
    private double jariJari;

    /* METHOD */
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }

    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
    
}

/* Kelas Asersi */
public class Asersi2 {

    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari>0): "jari-jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran = "+kelilingLingkaran);
    }
}
