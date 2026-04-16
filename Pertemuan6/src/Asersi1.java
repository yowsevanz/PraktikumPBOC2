/* Nama File    : Asersi1.java
 * Deskripsi    : Penggunaan asersi untuk mendeteksi nilai x harus lebih dari 0, jika x<0 maka menghasilkan error 
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 26 Maret 2026 */

public class Asersi1 {
    public static void main(String[] args) {
        int x = 0;
        if (x>0) {
            System.out.println("x bilangan positif");
        } else {
            assert(x>0): "ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}
