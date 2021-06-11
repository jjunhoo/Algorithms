package leetcode;

import java.util.ArrayList;
import java.util.List;

public class CountMatches {
    private final static String TYPE = "type";
    private final static String COLOR = "color";
    private final static String NAME = "name";

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int ruleKeyValue = -1;

        switch (ruleKey) {
            case TYPE:
                ruleKeyValue = 0;
                break;
            case COLOR:
                ruleKeyValue = 1;
                break;
            case NAME:
                ruleKeyValue = 2;
                break;
            default:
                break;
        }

        return getValue(items, ruleKeyValue, ruleValue);
    }

    private static int getValue(List<List<String>> items, int ruleKeyValue, String ruleValue) {
        int count = 0;

        for (int i=0; i<items.size(); i++) {
            if (ruleValue.equals(items.get(i).get(ruleKeyValue))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        List<String> items1 = new ArrayList<>();
        List<String> items2 = new ArrayList<>();
        List<String> items3 = new ArrayList<>();

        String ruleKey = "color";
        String ruleValue = "silver";

        items1.add("phone");
        items1.add("blue");
        items1.add("pixel");

        items2.add("computer");
        items2.add("silver");
        items2.add("lenovo");

        items3.add("phone");
        items3.add("gold");
        items3.add("iphone");

        items.add(items1);
        items.add(items2);
        items.add(items3);

        System.out.println("[result] : " + countMatches(items, ruleKey, ruleValue));
    }
}
