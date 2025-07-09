package AbstractDataTypes.Hashing;
import java.util.HashMap;

public class HashmapMain {

    public static void main(String[] args) {
        HashMap<String, String> capital = new HashMap<>();

        capital.put("England", "London"); // Putting new <String, String> objects inside the hashmap
        capital.put("Portugal", "Lisbon"); // with following format : (<key>, <value>)
        capital.put("Argentina", "Buenos Aires");
        capital.put("Spain","Madrid");
        capital.put("Netherlands","Amsterdam");
        capital.put("Germany","Berlin");

        System.out.println(capital.containsValue("Buenos Aires")); // check if the HashMap contains "Buenos Aires" as the value
        System.out.println(capital.toString());
        System.out.println(capital.get("Spain"));

    }
}
