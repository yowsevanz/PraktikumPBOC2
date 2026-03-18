/* Nama File    : BangunDatar.java
 * Deskripsi    : Kelas Bangun Datar
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 12 Maret 2026 */

// public final class BangunDatar {} // Keyword final pada kelas menjadikan kelas tidak dapat diwariskan 
public class BangunDatar {
    /* ATRIBUT */
    protected int jmlSisi;
    protected String warna;
    protected String border;
    private static int counterBangunDatar = 0;

    /* METHOD */
    // Konstruktor
    public BangunDatar(){
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;

    }

    // Selektor
    public int getJmlSisi(){
        return jmlSisi;
    }

    public String getWarna(){
        return warna;
    }

    public String getBorder(){
        return border;
    }

    // Mutator
    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public void setBorder(String border){
        this.border = border;
    }

    // Method lainnya
    
    // public final void printInfo() // Keyword final pada method menyebabkan method tidak dapat di override
    public void printInfo(){
        System.out.println("Jumlah Sisi : "+ jmlSisi);
        System.out.println("Warna       : "+warna);
        System.out.println("Border      : "+border);
    }

    public static void printCounterBangunDatar(){
        System.out.println("Jumlah objek bangun datar = "+counterBangunDatar);
    }
}
