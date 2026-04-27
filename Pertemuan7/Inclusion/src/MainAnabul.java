/* Nama File    : MainAnabul.java
 * Deskripsi    : MainAnabul merupakan Program utama yang membuat objek dari kelas turunan 
 *                Anabul serta menunjukkan perilaku polimorfisme
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 23 April 2026 */
import java.util.ArrayList;

public class MainAnabul {
    public static void main(String[] args) {
        Anabul anabul1 = new Anjing("Tomo");
        Anabul anabul2 = new Burung("merpati");
        Anabul anabul3 = new Kucing("Eli");
        // anabul1.Bersuara();
        // anabul1.Gerak();
        // anabul2.Bersuara();
        // anabul2.Gerak();
        // anabul3.Bersuara();
        // anabul3.Gerak();

        ArrayList<Anabul> anabuls = new ArrayList<>();
        anabuls.add(anabul1);
        anabuls.add(anabul2);
        anabuls.add(anabul3);
        for (Anabul anabul : anabuls) {
            anabul.Bersuara();
            anabul.Gerak();
            System.out.println();
        }

    }
}
