/* Nama File    : MTitik.java
 * Deskripsi    : Main Titik
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 26 Februari 2025 */


public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3, 4);
        System.out.println("T1 = ");
        T1.printTitik();

        
        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        System.out.println("Overloading constructor");
        Titik T3 = new Titik(1, 2);
        T3.printTitik();
        
        System.out.println("Counter Titik: " + Titik.getCounterTitik());
        
        System.out.println("Kuadran = " + T1.getKuadran());
        System.out.println("Jarak titik pusat T1 = " + T1.getJarakPusat());
        Titik T4 = new Titik();
        T4 = T3.getRefleksiX();

        

    }
}




