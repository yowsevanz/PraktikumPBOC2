/* Nama File    : Piaraan.java
 * Deskripsi    : Kelas Piaraan yang merepresentasikan daftar anabul peliharaan
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 7 Mei 2026 */
import java.util.LinkedList;

public class Piaraan {
    /* ATRIBUT */
    private int nbelm;
    private final LinkedList<Anabul> lanabul;

    /* METHOD */
    public Piaraan(){
        lanabul = new LinkedList<>();
        nbelm = 0;
    }

    //b.i. getNbelm()
    public int getNbelm(){
        return nbelm;
    }

    //b.ii. enqueueAnabul(anabul)
    public void enqueueAnabul(Anabul anabul){
        lanabul.addLast(anabul);
        nbelm++;
    }

    //b.iii. isMember(anabul)
    public boolean isMember(Anabul anabul){
        return lanabul.contains(anabul);
    }

    //b.iv. getAnabul()
    public Anabul getAnabul(){
        return lanabul.peekFirst();
    }


    //b.v. dequeueAnabul()
    public Anabul dequeueAnabul(){
        Anabul removed =  lanabul.poll();
        nbelm--;
        return removed;
    }
    

    //c. showAnabul()
    public void showAnabul(){
        for (int i = 0; i < nbelm; i++) {
            System.out.print(lanabul.get(i).getNama());
            if (i>=0 && i<nbelm-1) {
                System.out.print(", ");
            }
        }
    }

    //d. countKucing()
    public int countKucing(){
        int count = 0;
        for (int i=0; i<nbelm; i++) {
            if (lanabul.get(i) instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    //e. bobotKucing() 
    public double bobotKucing(){
        double total = 0;
        for (int i = 0; i < nbelm; i++) {
            if (lanabul.get(i) instanceof Kucing) {
                total+=((Kucing)lanabul.get(i)).getBobot();
            }
        }
        return total;
    }

    //f. showJenisAnabul()
    public void showJenisAnabul(){
        for (int i = 0; i < nbelm; i++) {
            System.out.println(lanabul.get(i).getNama() + " - " + lanabul.get(i).getClass().getName());
        }
    }
    
}
