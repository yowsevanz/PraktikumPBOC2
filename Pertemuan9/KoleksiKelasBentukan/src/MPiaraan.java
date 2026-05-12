/* Nama File    : MPiaraan.java
 * Deskripsi    : Kelas MPiaraan yang berisi Implementasi dari kelas Piaraan
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 7 Mei 2026 */

public class MPiaraan {
    public static void main(String[] args) {
        Piaraan P1 = new Piaraan();
        Anabul A1 = new Kucing("Stella", 3.23);
        P1.enqueueAnabul(A1);
        P1.enqueueAnabul(new Kucing("Lili", 3.3));
        System.out.println("b.i. getNbelm() = " + P1.getNbelm());
        P1.enqueueAnabul(new Anggora("Selena", 3.8));
        P1.enqueueAnabul(new Anjing("Tomoro"));
        P1.enqueueAnabul(new Burung("Juju"));
        System.out.println("b.ii. Piaraan P1 setelah enqueueAnabul");
        P1.showAnabul();
        System.out.println("b.iii. isMember(A1) = " + P1.isMember(A1));
        System.out.println("b.iv. getAnabul menampilkan nama Anabul pertama = " + P1.getAnabul().getNama());
        System.out.println("b.v. dequeueAnabul (Anabul Pertama dihapus) dengan nama " + P1.dequeueAnabul().getNama());
        System.out.println();

        System.out.println("c. showAnabul() setelah dequeueAnabul()");
        P1.showAnabul();
        System.out.println();
        System.out.println("d. countKucing = " + P1.countKucing());
        System.out.println("e. bobotKucing = " + P1.bobotKucing());
        System.out.println("f. showJenisAnabul()");
        P1.showJenisAnabul();
        
 
    }
}
