package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

// 소희와 버스
// https://level.goorm.io/exam/49107/%EC%86%8C%ED%9D%AC%EC%99%80-%EB%B2%84%EC%8A%A4/quiz/1
class BusInfo {
    private int busStartTime;
    private int busTime;
    private int idx;

    public BusInfo(int busStartTime, int busTime, int idx) {
        this.busStartTime = busStartTime;
        this.busTime = busTime;
        this.idx = idx;
    }

    public void setBusStartTime(int busStartTime) {
        this.busStartTime = busStartTime;
    }

    public void setBusTime(int busTime) {
        this.busTime = busTime;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public int getBusStartTime() {
        return busStartTime;
    }

    public int getBusTime() {
        return busTime;
    }

    public int getIdx() {
        return idx;
    }

    @Override
    public String toString() {
        return "BusInfo{" +
                "busStartTime=" + busStartTime +
                ", busTime=" + busTime +
                ", idx=" + idx +
                '}';
    }
}
public class SoheeAndBus {
    private static void solution(List<BusInfo> list, int arrivalTime) {
        int result = Integer.MAX_VALUE;
        int busStartTime = Integer.MAX_VALUE;
        int busTime = Integer.MAX_VALUE;

        // 버스 출발 시간 계산
        for (int i = 0; i < list.size(); i++) {
            while (list.get(i).getBusStartTime() < arrivalTime) {
                list.get(i).setBusStartTime(list.get(i).getBusStartTime() + list.get(i).getBusTime());
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getBusStartTime() <= busStartTime) {
                // busStartTime 이 같다면,  busTime 이 낮은 버스 선택
                if (list.get(i).getBusStartTime() == busStartTime && list.get(i).getBusTime() > busTime) {
                    continue;
                }
                result = list.get(i).getIdx();
                busStartTime = list.get(i).getBusStartTime();
                busTime = list.get(i).getBusTime();
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] momInfo = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(); // 버스의 수, 정류장 도착 시간
        List<BusInfo> list = new ArrayList<>();

        for (int i = 0; i < momInfo[0]; i++) {
            int[] busInfo = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            list.add(new BusInfo(busInfo[0], busInfo[1], i + 1));
        }

        solution(list, momInfo[1]);
    }
}
