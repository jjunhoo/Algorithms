package leetcode;

// leetcode
// https://leetcode.com/problems/merge-two-sorted-lists/
public class MergeTwoSortedLists {
    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode root = new ListNode();
        ListNode head = root;

        while (!(l1 == null && l2 == null)) {
            int val1 = l1 != null ? l1.val : Integer.MAX_VALUE;
            int val2 = l2 != null ? l2.val : Integer.MAX_VALUE;

            ListNode newNode = new ListNode();

            if (val1 >= val2) {
                newNode.val = val2;
                l2 = l2.next;
            } else {
                newNode.val = val1;
                l1 = l1.next;
            }
            root.next = newNode; // 루트 노드의 next 를 새로 생성한 노드로 변경
            root = root.next; // 루트 노드를 위 라인에서 갱신한 노드로 변경
        }
        return head.next;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l1Value1 = new ListNode(2);
        ListNode l1Value2 = new ListNode(4);
        l1.next = l1Value1;
        l1Value1.next = l1Value2;

        ListNode l2 = new ListNode(1);
        ListNode l2Value1 = new ListNode(3);
        ListNode l2Value2 = new ListNode(4);
        l2.next = l2Value1;
        l2Value1.next = l2Value2;

        System.out.println(mergeTwoLists(l1, l2));
    }
}
