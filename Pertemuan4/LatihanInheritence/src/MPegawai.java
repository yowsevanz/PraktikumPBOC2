import java.time.LocalDate;

public class MPegawai {
     public static void main(String[] args) {
       DosenTetap D1 = new DosenTetap(null, null, null, null, 0, null, null);

       System.out.println();

       D1.setNip("9545647548");
       D1.setNidn("78647324");
       D1.setNama("Andi");
       D1.setTanggallahir(LocalDate.parse("1990-05-05"));
       D1.setTmt(LocalDate.parse("2015-01-01"));
       D1.setFakultas("Fakultas Sains dan Matematika");
       D1.setGajipokok(5000000);
       D1.printInfo();

       System.out.println();
    }
}
