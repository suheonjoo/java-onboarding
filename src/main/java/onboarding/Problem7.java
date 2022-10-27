package onboarding;

import java.util.*;

public class Problem7 {
    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        List<String> answer = Collections.emptyList();
        return answer;
    }

    static class FriendGraph {
        private Map<String, List<String>> friendMap = new HashMap<>();

        public void addFriend(String user, String friend) {
            if (!friendMap.containsKey(user)) {
                friendMap.put(user,new ArrayList<>());
            }
            friendMap.get(user).add(friend);
        }

        public List<String> getFriendList(String user) {
            return friendMap.get(user);
        }

        public Iterator<String> getIteratorFriendGraph(){
            return friendMap.keySet().iterator();
        }

    }
    private static void initUserScoreMap(Map<String, Integer> scoreMap, String user) {
        if (!scoreMap.containsKey(user)) {
            scoreMap.put(user, 0);
        }
    }

    private static void updateScoreMapByUserFriendList(FriendGraph friendGraph,
                                                       Map<String, Integer> scoreMap,
                                                       List<String> userFriendList) {

        Iterator<String> friendMapList = friendGraph.getIteratorFriendGraph();
        for (String userFriend : userFriendList) {
            while (friendMapList.hasNext()) {
                String next = friendMapList.next();
                if (friendGraph.getFriendList(next).contains(userFriend)) {
                    scoreMap.put(next, scoreMap.get(next) + 10);
                }
            }
        }
    }

    private static void updateScoreMapByVisitorList(List<String> visitors, Map<String, Integer> scoreMap) {
        for (String visitor : visitors) {
            if (!scoreMap.containsKey(visitor)) {
                scoreMap.put(visitor, 0);
            }
            scoreMap.put(visitor, scoreMap.get(visitor) + 1);
        }
    }


}
