/* Nama File    : Mahasiswa.java
 * Deskripsi    : Kelas Mahasiswa yang menerapkan overloading
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 23 April 2026 */

public class Mahasiswa {
    /* ATRIBUT */
    private String Nim;
    private String Nama;
    private String Programstudi;


    /* KONSTRUKTOR */

    // c. Konstruktor Mahasiswa tanpa Parameter
    public Mahasiswa(){
        Nim = "-999";
        Nama = "n/a";
        Programstudi = "n/a";
    }

    // d. Konstruktor Mahasiswa 3 Parameter
    public Mahasiswa(String Nim, String Nama, String Programstudi){
        this.Nim = Nim;
        this.Nama = Nama;
        this.Programstudi = Programstudi;
    }

    // e. Kontruktor Mahasiswa dengan 1 parameter objek Mahasiswa lain
    public Mahasiswa(Mahasiswa M){
        this.Nim = M.getNim();
        this.Nama = M.getNama();
        this.Programstudi = M.getProgramStudi();
    }

    /* SELEKTOR */
    public String getNim(){
        return Nim;
    }

    public String getNama(){
        return Nama;
    }

    public String getProgramStudi(){
        return Programstudi;
    }

    /* MUTATOR */
    public void setNim(String Nim){
        this.Nim = Nim;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }
    
    // Mutator Program Studi tanpa parameter sehingga diisi string "Kosong"
    public void setProgramStudi(){
        this.Programstudi = "Kosong";
    }

    // Mutator Program Studi dengan parameter input
    public void setProgramStudi(String Programstudi){
        this.Programstudi = Programstudi;
    }

    // Mutator Program Studi dengan parameter objek Mahasiswa lain 
    // maka komponen Programstudi berisi sama dengan isian komponen Programstudi objek masukan
    public void setProgramStudi(Mahasiswa M1){
        this.Programstudi = M1.getProgramStudi();
    }

    /* METHOD PRINT */
    public void PrintMahasiswa(){
        System.out.println("\n=== Print Detail Mahasiswa ===");
        System.out.println("NIM             : " + getNim());
        System.out.println("Nama            : " + getNama());
        System.out.println("Program Studi   : " + getProgramStudi());

    }


}
