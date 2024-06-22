package arrays.utils.second;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Utils {
    static List<String> read(String filenName) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(filenName));
        List<String> strings = new ArrayList<>();
        while (sc.hasNext()) {
            strings.add(sc.next());
        }
        return strings;
    }

    static Map<String, Integer> uniqueCounter(List<String> list) {
        Map<String, Integer> uniqueMap = new TreeMap<>();
        for (int i = 0; i < list.size(); i++) {
            if (uniqueMap.containsKey(list.get(i))) {
                uniqueMap.put(list.get(i), uniqueMap.get(list.get(i)) + 1);
            } else {
                uniqueMap.put(list.get(i), 1);
            }
        }
        for (String s : uniqueMap.keySet()) {
            System.out.println(s + " występuje " + uniqueMap.get(s) + " razy");
        }
        return uniqueMap;
    }

    public static void maxFrequency(Map<String, Integer> map) {
        int max = Collections.max(map.values());
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (max == entry.getValue()) {
                System.out.println("Najczęściej występujący wyraz to : " + entry.getKey());
            }
        }
    }
}
