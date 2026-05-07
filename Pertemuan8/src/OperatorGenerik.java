/* Nama File    : OperatorGenerik.java
 * Deskripsi    : Kelas OperatorGenerik  berisi operator dari kelas generik
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 30 April 2026 */
public class OperatorGenerik {
    // Operator Tukar
    public static<T> void Tukar(Datum<T> a, Datum<T> b){
        T temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }

    // Fungsi Bobot2
     public static <T extends Kucing> double Bobot2(T a, T b) {
            return a.getBobot() + b.getBobot();
        }
}
