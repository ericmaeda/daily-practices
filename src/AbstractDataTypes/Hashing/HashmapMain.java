package AbstractDataTypes.Hashing;
import java.util.HashMap;

public class HashmapMain {

    public static void main(String[] args) {
        HashMap<String, String> capital = new HashMap<>();

        capital.put("England", "London");
        capital.put("Portugal", "Lisbon");
        capital.put("Argentina", "Buenos Aires");
        capital.put("Spain","Madrid");
        capital.put("Netherlands","Amsterdam");
        capital.put("Germany","Berlin");

        System.out.println(capital.containsValue("Buenos Aires"));
        System.out.println(capital.toString());
        System.out.println(capital.get("Spain"));

    }
}
