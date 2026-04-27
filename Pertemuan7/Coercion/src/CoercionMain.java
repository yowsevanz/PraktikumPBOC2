/* Nama File    : CoercionMain.java
 * Deskripsi    : Main Coercion adalah program utama untuk mendemonstrasikan konversi tipe data
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 23 April 2026 */

public class CoercionMain {
    public static void main(String[] args) throws Exception {
        int K = 65;
        System.out.println("integer K = " + K);
        // int ke char
        char hasil1 = (char) K;
        System.out.println("integer ke character = " + hasil1);

        // b. integer ke real
        double hasil2 = (double) K;
        System.out.println("integer ke real = "  + hasil2);

        // real ke integer
        int hasil3 = (int) hasil2;
        System.out.println("real ke integer = " + hasil3);

        // c.
        String X = "1234";
        String Y = "5678";

        // S berisi string hasil konkatenasi string X dan Y
        String S = X+Y;
        System.out.println("S = " + S);

        // Z berisi integer hasil penjumlahan angka X dan Y
        int Z = Integer.parseInt(X)+Integer.parseInt(Y);
        System.out.println("Z = " + Z);

        //d. 
        String P = "12.34";
        String Q = "56.78";

        // R berisi string hasil konkatenasi string P dan Q
        String R = P+Q;
        System.out.println("R = " + R);

        // D bertipe real hasil penjumlahan angka P dan Q
        double D = Double.parseDouble(X)+Double.parseDouble(Y);
        System.out.println("D = " + D);

        //e. integer A berisi hasil konversi nilai S
        int A = Integer.parseInt(S);
        System.out.println("A = " + A);

        //f. String T berisi hasil konversi nilai A
        String T = Integer.toString(A);
        System.out.println("T = " + T);
        
        






    }
}
