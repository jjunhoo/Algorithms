package lezhin;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Lezhin1 {
    /* 장르 개수 */
    private static int GENRE_COUNT = 3;
    /* 장르 종류 */
    private static final String SPORTS = "sports";
    private static final String GAG = "gag";
    private static final String FANTASY = "fantasy";
    /* 장르별 작품 리스트 */
    private static List<String> sportsList = new ArrayList<>();
    private static List<String> gagList = new ArrayList<>();
    private static List<String> fantasyList = new ArrayList<>();
    /* 추천 리스트 */
    private static List<String> recommendList = new ArrayList<>();
    /* 장르별 작품 개수 랭킹 */
    private static Map<String, Integer> rank = new HashMap<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (GENRE_COUNT > 0) {
            String genreList = br.readLine();
            String[] items = genreList.split(",");
            splitItemAndAddItem(items);
            GENRE_COUNT--;
        }

        printRecommendList(calculateMaximumCount());
    }

    // 입력 Line 의 item 분리
    private static void splitItemAndAddItem(String[] items) throws Exception {
        String genre = "";
        // 첫번째 index 의 item 이 장르인지 확인
        genre = validGenre(items[0]);
        // 두번째 index 부터 마지막까지 item 적재
        addGenreItem(genre, items);
    }

    // 장르 valid
    private static String validGenre(String genre) throws Exception {
        switch(genre) {
            case SPORTS:
                return SPORTS;
            case GAG:
                return GAG;
            case FANTASY:
                return FANTASY;
            default:
                throw new Exception("invalid genre");
        }
    }

    // 장르별 item 적재
    private static void addGenreItem(String genre, String[] items) {
        // items 적재 및 장르 구분 item 제거
        switch(genre) {
            case SPORTS:
                Collections.addAll(sportsList, items);
                sportsList.remove(0);
                break;
            case GAG:
                Collections.addAll(gagList, items);
                gagList.remove(0);
                break;
            case FANTASY:
                Collections.addAll(fantasyList, items);
                fantasyList.remove(0);
                break;
        }
    }

    // List 개수 입력 및 최대 개수 계산
    private static List<String> calculateMaximumCount() {
        rank.put(SPORTS, sportsList.size());
        rank.put(GAG, gagList.size());
        rank.put(FANTASY, fantasyList.size());

        List<String> rankList = new ArrayList(rank.keySet());
        Collections.sort(rankList, (o1, o2) -> (rank.get(o2).compareTo(rank.get(o1))));

        return rankList;
    }

    // 추천 리스트 출력
    private static void printRecommendList(List<String> rankList) {
        switch (rankList.get(0)) {
            case SPORTS:
                if (GAG.equals(rankList.get(1))) {
                    for (int i = 0; i < sportsList.size(); i++) {
                        if (sportsList.size() > i && !sportsList.get(i).isEmpty()) {
                            recommendList.add(sportsList.get(i));
                        }
                        if (gagList.size() > i && !gagList.get(i).isEmpty()) {
                            recommendList.add(gagList.get(i));
                        }
                        if (fantasyList.size() > i && !fantasyList.get(i).isEmpty()) {
                            recommendList.add(fantasyList.get(i));
                        }
                    }
                } else if (FANTASY.equals(rankList.get(1))) {
                    for (int i = 0; i < sportsList.size(); i++) {
                        if (sportsList.size() > i && !sportsList.get(i).isEmpty()) {
                            recommendList.add(sportsList.get(i));
                        }
                        if (fantasyList.size() > i && !fantasyList.get(i).isEmpty()) {
                            recommendList.add(fantasyList.get(i));
                        }
                        if (gagList.size() > i && !gagList.get(i).isEmpty()) {
                            recommendList.add(gagList.get(i));
                        }
                    }
                }
                break;
            case GAG:
                if (SPORTS.equals(rankList.get(1))) {
                    for (int i = 0; i < gagList.size(); i++) {
                        if (gagList.size() > i && !gagList.get(i).isEmpty()) {
                            recommendList.add(gagList.get(i));
                        }
                        if (sportsList.size() > i && !sportsList.get(i).isEmpty()) {
                            recommendList.add(sportsList.get(i));
                        }
                        if (fantasyList.size() > i && !fantasyList.get(i).isEmpty()) {
                            recommendList.add(fantasyList.get(i));
                        }
                    }
                } else if (FANTASY.equals(rankList.get(1))) {
                    for (int i = 0; i < gagList.size(); i++) {
                        if (gagList.size() > i && !gagList.get(i).isEmpty()) {
                            recommendList.add(gagList.get(i));
                        }
                        if (fantasyList.size() > i && !fantasyList.get(i).isEmpty()) {
                            recommendList.add(fantasyList.get(i));
                        }
                        if (sportsList.size() > i && !sportsList.get(i).isEmpty()) {
                            recommendList.add(sportsList.get(i));
                        }
                    }
                }
                break;
            case FANTASY:
                if (SPORTS.equals(rankList.get(1))) {
                    for (int i = 0; i < fantasyList.size(); i++) {
                        if (fantasyList.size() > i && !fantasyList.get(i).isEmpty()) {
                            recommendList.add(fantasyList.get(i));
                        }
                        if (sportsList.size() > i && !sportsList.get(i).isEmpty()) {
                            recommendList.add(sportsList.get(i));
                        }
                        if (gagList.size() > i && !gagList.get(i).isEmpty()) {
                            recommendList.add(gagList.get(i));
                        }
                    }
                } else if (GAG.equals(rankList.get(1))) {
                    for (int i = 0; i < fantasyList.size(); i++) {
                        if (fantasyList.size() > i && !fantasyList.get(i).isEmpty()) {
                            recommendList.add(fantasyList.get(i));
                        }
                        if (gagList.size() > i && !gagList.get(i).isEmpty()) {
                            recommendList.add(gagList.get(i));
                        }
                        if (sportsList.size() > i && !sportsList.get(i).isEmpty()) {
                            recommendList.add(sportsList.get(i));
                        }
                    }
                }
        }
        System.out.println(recommendList.toString());
    }
}
