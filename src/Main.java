import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Main {
    public static final void main(String[] args) {
        System.out.println(compareDogAndCat("1catdog"));
//        System.out.println(returnMap("salt", "tea", "soda", "toast"));
        System.out.println(returnWithoutSubstring("Helloxxx there", "e"));


    }

    //  method for first task
    public static boolean compareDogAndCat(String line) {
        boolean check;
        if (line.contains("cat") && line.contains("dog")) {
            check = true;
            while (line.contains("cat") && line.contains("dog")) {
                line = line.replaceFirst("cat", "");
                line = line.replaceFirst("dog", "");
            }
            if (line.contains("cat") || line.contains("dog")) {
                check = false;
            }
        } else {
            check = false;
        }
        return check;
    }

    //  method for second task
    public static Map<Character, String> returnMap(String... mass) {
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < mass.length; i++) {
            char key = mass[i].charAt(0);
            if (map.containsKey(key)) {
                map.replace(key, map.get(key) + mass[i]);
            } else {
                map.put(key, mass[i]);
            }
        }
        return map;
    }

    //    method for third task
    public static String returnWithoutSubstring(String base, String removeLine) {
        while (base.contains(removeLine)) {
            base = base.replaceFirst(removeLine, "");
        }
        return base;
    }
}
