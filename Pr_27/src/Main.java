//оздайте словарь (Map<String, String>), запишите в него десять записей по принципу «фамилия» - «имя». Удалите людей, имеющих одинаковые имена. Выведите словарь на печать
//
//Опишите класс City с полями город, страна. Запишите исходные данные в HashMap, где ключ - страна, значение - город. Map<String,ArrayList<String>> map = new HashMap();
//
//Записать необходимо таким образом, чтобы каждому ключу (стране) соответствовал список значений (городов).


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //1
        Map<String, String> nameMap = new HashMap<>();
        nameMap.put("Smith", "John");
        nameMap.put("Johnson", "Mike");
        nameMap.put("Williams", "Kate");
        nameMap.put("Jones", "John");
        nameMap.put("Brown", "Anne");
        nameMap.put("Davis", "Tom");
        nameMap.put("Miller", "Chris");
        nameMap.put("Wilson", "Kate");
        nameMap.put("Moore", "Bill");
        nameMap.put("Taylor", "Anne");

        // Remove people with the same name
        nameMap.values().removeIf(name -> Collections.frequency(nameMap.values(), name) > 1);

        // Print the dictionary
        for (Map.Entry<String, String> entry : nameMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }



        //2
        Map<String, ArrayList<String>> map = new HashMap<>();

        // Add some cities to the map
        map.put("USA", new ArrayList<String>() {{ add("New York"); add("Los Angeles"); }});
        map.put("Russia", new ArrayList<String>() {{ add("Moscow"); add("St. Petersburg"); }});

        // Print the map
        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
