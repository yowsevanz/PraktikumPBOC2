public class Dosen {
    /* ATRIBUT */
    private String nip;
    private String nama;
    private String prodi;


    /* KONSTRUKTOR */
    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    public Dosen(){
        this.nip = "";
        this.nama = "";
        this.prodi = "";
    }


    /* SELEKTOR */
    public String getNIP(){
        return nip;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    /* MUTATOR */
    public void setNIP(String NIP){
        this.nip = NIP;
    }
 
    public void setNama(String Nama){
        this.nama = Nama;
    }

    public void setProdi(String Prodi){
        this.prodi = Prodi;
    }

    /* METHOD */
    /* Mengeluarkan detail dari Dosen Wali */
    public void printDosWal(){
        System.out.println("NIP     : "+getNIP());
        System.out.println("Nama    : "+getNama());
        System.out.println("Prodi   : "+getProdi());
    }

    


}
