import java.util.ArrayList;

public class Mahasiswa {
    /* ATRIBUT */
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatKul;
    private Dosen DosenWali;
    private Kendaraan kendaraan;

    /* KONSTRUKTOR */
    public Mahasiswa(){
        this.listMatKul = new ArrayList<>();
    }

    public Mahasiswa(String nim, String nama, String prodi, ArrayList<MataKuliah> MataKuliah, Dosen DosenWali, Kendaraan kendaraan){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>();
        this.DosenWali = DosenWali;
        this.kendaraan = kendaraan;

    }

    /* SELEKTOR */
    public String getNIM(){
        return nim;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    public Dosen getDosenWali(){
        return DosenWali; 
    }

    public Kendaraan getKendaraan(){
        return kendaraan;
    }

    /* MUTATOR */
    public void setNIM(String nim){
        this.nim = nim;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    public void setDosenWali(Dosen Doswal){
        this.DosenWali = Doswal;
    }

    public void setKendaraan(Kendaraan A){
        this.kendaraan = A;
    }

    
    /* Method addMatkul() untuk menambahkan sebuah mata kuliah ke atribut listMatKul */
    public void addMatKul (MataKuliah newMatKul) {
        listMatKul.add (newMatKul);
    }

    /* Method getJumlahMatKul() untuk mendapatkan jumlah mata kuliah yang diambil mahasiswa.*/
    public void getJumlahSKS(){
        int Jumlah = 0;
        for (int j = 0; j < listMatKul.size(); j++) {
             Jumlah += listMatKul.get(j).getSKS();
        }
        System.out.println("Jumlah SKS    : "+Jumlah);
    }

    /* Method getJumlahMatKul() untuk mendapatkan jumlah mata kuliah yang diambil mahasiswa. */
    public void getJumlahMatKul(){
        System.out.println("Jumlah MatKul : "+listMatKul.size());
    }

    /* Method printMhs() untuk menampilkan nim, nama, dan prodi mahasiswa. */
    public void printMhs(){
        System.out.println("Nim   : " + nim); 
        System.out.println("Nama  : " + nama); 
        System.out.println("Prodi : " + prodi);
    }


    /* Method printDetailMhs() untuk menampilkan nim, nama, prodi, daftar mata kuliah yang diambil, data dosen wali, serta data kendaraan yang dimiliki mahasiswa. */
    public void printDetailMhs(){
        System.out.println("Nim         : " + nim); 
        System.out.println("Nama        : " + nama); 
        System.out.println("Prodi       : " + prodi); 
        
        
        System.out.println("\nData Dosen Wali");
        DosenWali.printDosWal();

        System.out.println("\nMata Kuliah" ); 
        for (int i=0;i<listMatKul.size();i++){
            System.out.println(listMatKul.get(i).getNamaMK());
        }

        System.out.println("\nData Kendaraan");
        kendaraan.printKendaraan();

        
    } 
}
