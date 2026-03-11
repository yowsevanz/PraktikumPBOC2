// import java.util.ArrayList;

import java.util.ArrayList;

public class MMahasiswa {
    public static void main(String[] args) {

        /*REALISASI CLASS DOSEN*/
        System.out.println("\n===REALISASI CLASS DOSEN===");
        Dosen DosenA = new Dosen("4123", "Ari", "Informatika" );
        System.out.println("Identitas Dosen A");
        System.out.println("NIP     : "+ DosenA.getNIP());
        System.out.println("Nama    : "+ DosenA.getNama());
        System.out.println("Prodi   : "+ DosenA.getProdi());

        Dosen DosenB = new Dosen();
        DosenB.setNIP("43589");
        DosenB.setNama("Budi");
        DosenB.setProdi("Informatika");
        System.out.println("\nIdentitas Dosen B");
        System.out.println("NIP     : "+ DosenB.getNIP());
        System.out.println("Nama    : "+ DosenB.getNama());
        System.out.println("Prodi   : "+ DosenB.getProdi());

        /*REALISASI CLASS MATA KULIAH*/
        System.out.println("\n===REALISASI CLASS MATA KULIAH===");
        MataKuliah MK1 = new MataKuliah("MK01", "PBO", 3);
        System.out.println(("Nama MK1 = " + MK1.getNamaMK()));

        MataKuliah MK2 = new MataKuliah();
        MK2.setIdMatkul("MK02");
        MK2.setNamaMK("ASA");
        MK2.setSKS(3);
        System.out.println("Detail Matakuliah MK2");
        System.out.println("ID MK: "+ MK2.getIdMatkul());
        System.out.println("Nama : "+ MK2.getNamaMK());
        System.out.println("SKS  : "+ MK2.getSKS());

        MataKuliah MK3 = new MataKuliah("MK03", "JARKOM", 3);
        MataKuliah MK4 = new MataKuliah("MK04", "KECERDASAN BUATAN", 3);
        MataKuliah MK5 = new MataKuliah("MK05", "KJI", 3);



        /*REALISASI CLASS KENDARAAN*/
        System.out.println("\n===REALISASI CLASS KENDARAAN===");
        Kendaraan K1 = new Kendaraan();
        K1.setJenis("Motor");
        K1.setNoPlat("C 0127 IS");
        System.out.println("Jenis Kendaraan K1  : "+ K1.getJenis());
        System.out.println("Plat Kendaraan K1   : "+ K1.getNoPlat());
        Kendaraan K2 = new Kendaraan("Z 1810 WN", "Mobil");
        System.out.println("Jenis Kendaraan K2  : "+ K2.getJenis());
        System.out.println("Plat Kendaraan K2   : "+ K2.getNoPlat());



        /*REALISASI CLASS MAHASISWA*/
        System.out.println("\n===REALISASI CLASS MAHASISWA===");
        Mahasiswa MHS1 = new Mahasiswa();
        MHS1.setNIM("24213"); 
        MHS1.setNama("James");
        MHS1.setProdi("Informatika");
        MHS1.setDosenWali(DosenA);
        MHS1.setKendaraan(K1);
        MHS1.addMatKul(MK1);
        MHS1.addMatKul(MK2);
        MHS1.addMatKul(MK3);
        MHS1.addMatKul(MK4);
        MHS1.addMatKul(MK5);

        Mahasiswa MHS2 = new Mahasiswa("247899", "RICKY", "Informatika", new ArrayList<>(), DosenB, K2);

        System.out.println("Identitas MHS1");
        MHS1.printDetailMhs();
        System.out.println("");
        MHS1.getJumlahSKS();
        MHS1.getJumlahMatKul();

        System.out.println("\nIdentitas MHS2");
        MHS2.addMatKul(MK5);
        MHS2.addMatKul(MK3);
        MHS2.printDetailMhs();

    }
    

}
