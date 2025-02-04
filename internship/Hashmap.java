import java.util.HashMap;
import java.util.Map;

public class Hashmap{
    public static void main(String[] args) {
        Map<String,String> Countrycapital=new HashMap<>();
        Countrycapital.put("india", "delhi");
        Countrycapital.put("germany", "berlin");
        Countrycapital.put("USA", "washington");

        System.out.println("capital of india:"+Countrycapital.get("india"));
        
        
    }

}