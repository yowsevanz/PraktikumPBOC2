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
        System.out.println("Titik T1 : ");
        T1.printTitik();
        
        Titik T2 = T1;
        System.out.println("Titik T2 : ");
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        System.out.println("Titik T1 setelah diubah : ");
        T1.printTitik();
        System.out.println("Titik T2 setelah diubah : ");
        T2.printTitik();

        System.out.println("Overloading constructor T3");
        Titik T3 = new Titik(1, 2);
        T3.printTitik();
        
        System.out.println("Counter Titik: " + Titik.getCounterTitik());


        
        System.out.println("Kuadran T1 = " + T1.getKuadran());
        T1.printTitik();
        System.out.println("Jarak titik pusat T1 = " + T1.getJarakPusat());

        System.out.println("\nProcedure Refleksi");
        System.out.println("refleksiX T3 = ");
        T3.refleksiX();
        T3.printTitik();

        System.out.println("refleksiY T3 = ");
        T3.refleksiY();
        T3.printTitik();

        System.out.println("\nFungsi Refleksi");
        Titik T4 = new Titik();
        T4 = T1.getRefleksiX();
        System.out.println("RefleksiX T1 = ");
        T4.printTitik();
        Titik T5 = new Titik();
        T5 = T1.getRefleksiY();
        System.out.println("RefleksiX T1 = ");
        T5.printTitik();
        

    }
}




