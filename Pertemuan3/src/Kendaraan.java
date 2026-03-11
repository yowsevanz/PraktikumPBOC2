public class Kendaraan {
    /* ATRIBUT */
    private String noPlat;
    private String jenis;

    /* KONSTRUKTOR */
    public Kendaraan(){
        this.noPlat = "";
        this.jenis = "";
    }

    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    /* SELEKTOR */
    public String getNoPlat(){
        return noPlat;
    }

    public String getJenis(){
        return jenis;
    }

    /* MUTATOR */
    public void setNoPlat(String noplat){
        this.noPlat = noplat;
    }

    public void setJenis(String jenis){
        this.jenis = jenis;
    }

    /* METHOD printKendaraan() untuk menampilkan jenis dan no plat dari kendaraan. */
    public void printKendaraan(){
        System.out.println("Jenis Kendaraan     : "+getJenis());
        System.out.println("No Plat Kendaraan   : "+getNoPlat());
    }
}
