import java.util.*;
public class LambdaMap {
    public static void main(String[] args) {
        Map<String,String> mahasiswaMap = new LinkedHashMap<>();
        mahasiswaMap.put("24130097", "Max");
        mahasiswaMap.put("24130116", "Neil");
        mahasiswaMap.put("24130099", "Ethan");

        mahasiswaMap.forEach((key, nama) -> System.out.println(key + " " + nama));
        
    }
}
