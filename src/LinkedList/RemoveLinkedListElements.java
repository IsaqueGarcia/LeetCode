package LinkedList;

public class RemoveLinkedListElements {

    public static void main(String[] args) {
        ListNode list1 =
                new ListNode(1,
                        new ListNode(6,
                                new ListNode(2,
                                        new ListNode(6))));

        solution(list1, 6).printAll();
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public void printAll() {
            String print = "[";
            ListNode temp = this;
            while (temp.next != null) {
                print = print.concat(String.valueOf(temp.val)).concat(", ");
                temp = temp.next;
            }
            print = print.concat(String.valueOf(temp.val)).concat("]");
            System.out.println(print);
        }
    }

    public static ListNode solution(ListNode head, int val) {

        ListNode res = new ListNode(0, head);
        ListNode dummy = res;

        while(dummy != null){
            while(dummy.next != null && dummy.next.val == val){
                dummy.next = dummy.next.next;
            }
            dummy = dummy.next;
        }

        return res.next;
    }
}
