public class MataKuliah {
    /* ATRIBUT */
    private String idMatkul;
    private String namaMK;
    private int sks;

    /* KONSTRUKTOR */
    public MataKuliah(){
        this.idMatkul = "";
        this.namaMK = "";
        this.sks = 0;
    }
    public MataKuliah(String idMatkul, String nama, int sks){
        this.idMatkul = idMatkul;
        this.namaMK = nama;
        this.sks = sks;
    }

    /* SELEKTOR */
    public String getIdMatkul(){
        return idMatkul;
    }

    public String getNamaMK(){
        return namaMK;
    }

    public int getSKS(){
        return sks;
    }

    /* MUTATOR */
    public void setIdMatkul(String id){
        this.idMatkul = id;
    }

    public void setNamaMK(String nama){
        this.namaMK = nama;
    }

    public void setSKS(int sks){
        this.sks = sks;
    }
}
