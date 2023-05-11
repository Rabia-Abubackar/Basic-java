import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map1{

    public static void main(String[] args)
    {
       Map<String,Integer> books = new HashMap<>();
       Map<String, Integer> books1 = new LinkedHashMap<>();
        Map<String, Integer> books3 = new TreeMap<>();

        books.put("two states", 101);
        books.put("red tea", 304);
        books.put("alien", 203);


        for (Map.Entry<String, Integer> e : books.entrySet())

            System.out.println(e.getKey() + " "
                    + e.getValue());

        books1.putAll(books);

        for (Map.Entry<String, Integer> e : books1.entrySet())

            System.out.println(e.getKey() + " "
                    + e.getValue());
        
        books3.putAll(books);

        for (Map.Entry<String, Integer> e : books3.entrySet())

        System.out.println(e.getKey() + " "
                + e.getValue());

    }
}