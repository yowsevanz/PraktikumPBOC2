/* Nama File    : MTeman.java
 * Deskripsi    : Kelas MTeman berisi Implementasi dari kelas Teman
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 7 Mei 2026 */
public class MTeman {
    public static void main(String[] args) {
        Teman T1 = new Teman();
        System.out.println(T1.getNbelm());
        T1.addNama("Apin");
        T1.addNama("Ipin");
        T1.addNama("Upin");
        System.out.println();
        T1.showNama();
        System.out.println("\na. getNbelm Teman = " + T1.getNbelm());
        System.out.println("b. getNama indeks 0 = " + T1.getNama(0));
        T1.setNama(0, null);
        System.out.println("c. T1 indeks 0 setNama = " + T1.getNama(0));
        T1.addNama("gopal");
        System.out.println("d. addNama(gopal) = ");
        T1.showNama();
        T1.delNama(null);
        System.out.println("\ne. delNama(null) =");
        T1.showNama();
        System.out.println("\nf. isMember(Apin) = " + T1.isMember("Apin"));
        System.out.println("g. gantiNama(gopal, Ipin) = ");
        T1.gantiNama("gopal", "Ipin");
        T1.showNama();
        System.out.println("\nh. countNama(Ipin) = " + T1.countNama("Ipin"));
        System.out.println("i. showTeman() ");
        T1.showNama();



        // System.out.println(T1.getNama(1));
    }
}
