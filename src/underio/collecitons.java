package underio;

import java.util.*;

public class collecitons {
    public static void main(String[] args) {
        /* COLLECTIONS */

        // LISTS
        List<String> moreQuestions = new ArrayList<>();
        moreQuestions.add("What website hosts the most videos in the world?");
        moreQuestions.clear();

        List<Integer> pointsOnTests = new ArrayList<>();
        pointsOnTests.add(19);
        pointsOnTests.add(55);
        pointsOnTests.add(78);

        System.out.println(pointsOnTests);

        // SETS
        Set<String> countrtiesToVisit = new HashSet<>();
        countrtiesToVisit.add("France");
        countrtiesToVisit.add("Germany");
        countrtiesToVisit.add("Spain");
        countrtiesToVisit.add("France");

        System.out.println(countrtiesToVisit);

        // MAPS
        Map<String, Integer> countryToPopulationMap = new HashMap<>();
        countryToPopulationMap.put("USA", 331000000);
        countryToPopulationMap.put("United Kingdom", 67330000);
        countryToPopulationMap.put("Austria", 8950000);

        System.out.println(countryToPopulationMap.get("Austria"));
        System.out.println(countryToPopulationMap.get("Germany"));

        System.out.println(countryToPopulationMap);


        moreQuestions.add("What website hosts the most videos in the world?");
        moreQuestions.add("What is the capitol of Germany?");
        for(int i = 0; i < moreQuestions.size(); i++) {
            System.out.println(moreQuestions.get(i));
        }

        for (Map.Entry<String, Integer> entry : countryToPopulationMap.entrySet()) {
            System.out.println("Key = " + entry.getKey() + " || Value = " + entry.getValue());
        }

    }
}
