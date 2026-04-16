/* Nama File    : AngkaSialException.java
 * Deskripsi    : Kelas exception untuk menangani kasus penggunaan angka sial
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 26 Maret 2026 */
public class AngkaSialException extends Exception {
    public AngkaSialException(){
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}
