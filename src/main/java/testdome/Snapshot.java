package testdome;

import java.util.ArrayList;

public class Snapshot {
    private final ArrayList<Integer> data;

    public Snapshot(ArrayList<Integer> data) {
        this.data = new ArrayList<>(data);
    }

    // Snapshot 인스턴스 생성 시 저장된 데이터 ArrayList 리턴 (snapshot)
    public ArrayList<Integer> restore() {
        return new ArrayList<>(this.data);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        Snapshot snap = new Snapshot(list);
        System.out.println("[list] : " + list);

        // 0 index 를 수정하더라도 new Snapshot(list) 시 스냅샷 된 데이터 출력
        list.set(0, 3);
        list = snap.restore();
        System.out.println("[list] : " + list);

        // list 에 element 를 추가하더라도 new Snapshot(list) 시 스냅샷 된 데이터 출력
        list.add(4);
        list = snap.restore();
        System.out.println("[list] : " + list);
    }
}
