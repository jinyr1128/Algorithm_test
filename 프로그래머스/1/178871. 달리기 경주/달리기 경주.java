import java.util.*;

public class Solution {
    public static String[] solution(String[] players, String[] callings) {

        Map<String, Integer> rankMap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            rankMap.put(players[i], i);
        }

        for (String calling : callings) {

            int rank = rankMap.get(calling);
            

            String temp = players[rank];
            players[rank] = players[rank - 1];
            players[rank - 1] = temp;


            rankMap.put(players[rank], rank);
            rankMap.put(players[rank - 1], rank - 1);
        }

        return players;
    }
}

