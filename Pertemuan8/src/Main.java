/* Nama File    : Main.java
 * Deskripsi    : Berisi Aplikasi dari kelas kelas lain
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 30 April 2026 */
public class Main {

    public static void main(String[] args) {
        // I. GENERIK PADA KELAS
        Datum<Anabul> data = new Datum<>(new Kucing("Mimi", 3.5));
        data.tampilkanAnabul(data.getIsi());
        System.out.println();

        data.setIsi(new Anggora("Kiki", 4.3));
        data.tampilkanAnabul(data.getIsi()); System.out.println();
        data.setIsi(new KembangTelon("Momo", 5.1)); 
        data.tampilkanAnabul (data.getIsi());

        data.setIsi(new KembangTelon("Momo",  5.1)); 
        data.tampilkanAnabul(data.getIsi());
        
        //II. GENERIK PADA Operator

        //METHOD GENERIK 
        System.out.println("Prosedur Tukar"); 
        // Tukar sesama Keluarga Anabul
        Datum<Anabul> hewan1 = new Datum<>(new Kucing("Kitty",  4.5)); 
        Datum<Anabul> hewan2 = new Datum<>(new Anjing("Doggy")); 
        System.out.println("hewan 1 sebelum tukar");
        data.tampilkanAnabul(hewan1.getIsi()); 
        System.out.println("hewan 2 sebelum tukar");
        data.tampilkanAnabul(hewan2.getIsi());
        OperatorGenerik.Tukar(hewan1, hewan2); 
        System.out.println("\nhewan 1 setelah tukar");
        data.tampilkanAnabul(hewan1.getIsi()); 
        System.out.println("hewan 2 setelah tukar"); 
        data.tampilkanAnabul(hewan2.getIsi());

        //Tukar Integer
        Datum<Integer> a = new Datum<>( 3); 
        Datum<Integer> b = new Datum<>(6);
        System.out.println("a dan b sebelum tukar " ); 
        System.out.println("a = " + a.getIsi()); // 6 
        System.out.println("b = " + b.getIsi()); // 3
        OperatorGenerik.Tukar(a, b);
        System.out.println("a dan b setelah tukar "); 
        System.out.println("a = " + a.getIsi()); // 6 
        System.out.println("b = " + b.getIsi()); // 3

        //Tukar sesama String
        Datum<String> s1 = new Datum<>( "string1"); 
        Datum<String> s2 = new Datum<>("string2");
        System.out.println("s1 dan s2 sebelum tukar " ); 
        System.out.println("s1 = " + s1.getIsi()); // 6 
        System.out.println("s2 = " + s2.getIsi()); // 3
        OperatorGenerik.Tukar(s1, s2);
        System.out.println("s1 dan s2 setelah tukar " ); 
        System.out.println("s1 = " + s1.getIsi()); // 6 
        System.out.println("b = " + s2.getIsi()); // 3
        
        //Bobot2
        Kucing kucing1 = new Anggora("Soraya", 3.5);
        Kucing kucing2 = new KembangTelon("Masha", 3.2);
        System.out.println("Bobot Kucing 1 : " + kucing1.getBobot() + " kg");
        System.out.println("Bobot Kucing 2 : " + kucing2.getBobot() + " kg");
        System.out.println("Jumlah bobot keduanya :  " + OperatorGenerik.Bobot2(kucing1, kucing2) + " kg");


        //III. LARIK GENERIK 

        System.out.println();
        Data<Anabul> dataAnabul = new Data<>(new Anabul[0]);

        dataAnabul.setIsi(1, new Kucing("Timi", 3.3));
        dataAnabul.setIsi(2, new Burung("Tama"));
        dataAnabul.setIsi(3, new Anjing("Tomo"));

        for(int i = 1; i<= dataAnabul.getSize(); i++) {
          System.out.println("setIsi posisi " + i + " : " + dataAnabul.getIsi(i).getNama()+ " " +  dataAnabul.getIsi(i).getClass());
        }
        System.out.println("Banyak elemen : " + dataAnabul.getSize());

    }
        


}
