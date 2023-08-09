import java.util.HashMap;
import java.util.Map;
// import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        // Map<String,Integer> users = new Hashmap<>();
        Map<String,Integer> users = new HashMap<>();
        users.put("jaybalaji192", 12345);
        users.put("dream69", 67890);
        users.put("bhoju", 13579);
        users.put("bunnygirl", 24680);


        // users.put("jaybalaji192", 99);
        users.putIfAbsent("jaybalaji192", 99);
        System.out.println(users);

        for(Map.Entry<String, Integer> entry : users.entrySet()){
            System.out.println(entry.getKey());
            // System.out.println(entry.ge);
        }

        for (String i : users.keySet())
            System.out.println(i);

        users.containsKey(99);
        users.isEmpty();
        // users.clear();




    }
}
