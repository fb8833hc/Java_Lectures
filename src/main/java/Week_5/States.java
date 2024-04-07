package Week_5;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class States {
    public static void main(String[] args) {
        Map<String, String> stateAbbreviations = new TreeMap<>();
        stateAbbreviations.put("Minnesota", "MN");
        stateAbbreviations.put("Wisconsin", "WI");
        stateAbbreviations.put("Michigan", "MI");
        stateAbbreviations.put("Iowa", "IA");

        System.out.println(stateAbbreviations);

        System.out.println(stateAbbreviations.get("Minnesota"));
        System.out.println(stateAbbreviations.get("Iowa"));

        String wisconsinAbbreiation = stateAbbreviations.get("Wisconsin");
        System.out.println(wisconsinAbbreiation);

        for (String stateName: stateAbbreviations.keySet()) {
            System.out.println(stateName);
            System.out.println(stateAbbreviations.get(stateName));
        }

        for (String abbreviations: stateAbbreviations.values()) {
            System.out.println(abbreviations);
        }

        String searchAbbreviation = "MI";

        for (String stateName: stateAbbreviations.keySet()) {
            System.out.println(stateName);
            String abbreviations = stateAbbreviations.get(stateName);
            if (abbreviations.equals(searchAbbreviation)) {
                System.out.println("Found it! The state for " + searchAbbreviation + " is " + stateName);
            }
        }

        Map<String, String> abbreviationsStateNames = new HashMap<>();

        for (Map.Entry<String, String> entry: stateAbbreviations.entrySet()) {
            String state = entry.getKey();
            String abbreviation = entry.getValue();
            abbreviationsStateNames.put(abbreviation, state);
        }

        System.out.println(abbreviationsStateNames);
        System.out.println(stateAbbreviations);

        System.out.println("There are " + stateAbbreviations.size() + " states listed");
    }
}
