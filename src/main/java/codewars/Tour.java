package codewars;

import java.util.*;
import java.util.stream.Collectors;

public class Tour {


    public static void main(String[] args) {
        String[] friends1 = new String[]{"A1", "A2", "A3", "A4", "A5"};
        String[][] fTowns1 = {new String[]{"A1", "X1"}, new String[]{"A2", "X2"}, new String[]{"A3", "X3"},
                new String[]{"A4", "X4"}};
        Map<String, Double> distTable1 = new HashMap<String, Double>();
        distTable1.put("X1", 100.0);
        distTable1.put("X2", 200.0);
        distTable1.put("X3", 250.0);
        distTable1.put("X4", 300.0);
        System.out.println(tour(friends1, fTowns1, distTable1));

    }

    public static int tour(String[] arrFriends, String[][] ftwns, Map<String, Double> h) {

        List<String> listOfTwns = new ArrayList<>();
        for (int j = 0; j < ftwns.length; j++) {
            for (int k = 0; k < arrFriends.length; k++) {
                if (ftwns[j][0] == arrFriends[k]) {
                    listOfTwns.add(ftwns[j][1]);
                }
            }
        }
        List<Double> distances = listOfTwns.stream()
                .map(e -> h.get(e))
                .collect(Collectors.toList());
        List<Double> dist = distances.stream()
                .map(e -> Math.pow(e, 2))
                .collect(Collectors.toList());
        double sum = 0;
        for (int i = 0; i < dist.size(); i++) {
            if (i < dist.size() - 1) {
                sum = sum + Math.sqrt(dist.get(i + 1) - dist.get(i));
            }
        }
        double result = distances.get(0) + distances.get(distances.size() - 1) + sum;
        return (int) result;


    }


}
