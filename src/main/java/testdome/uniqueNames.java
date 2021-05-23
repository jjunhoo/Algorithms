package testdome;

import java.util.Set;
import java.util.TreeSet;

public class uniqueNames {
    // 중복 없이 이름 배열 리턴
    public static String[] uniqueNames(String[] names1, String[] names2) {

        Set<String> set = new TreeSet();

        for (String name : names1) {
            set.add(name);
        }
        for (String name : names2) {
            set.add(name);
        }

        String[] result = new String[set.size()];
        result = set.toArray(result);

        return result;
    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", uniqueNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}
