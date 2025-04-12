public class RemoveNodeFromList {

    public static void main(String[] args) {
        ListNode list1 =
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(4,
                                                new ListNode(5)))));

        ListNode list2 = new ListNode(1, new ListNode(2));

        solution(list1, 2).printAll();

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

    public static ListNode solution(ListNode head, int n) {
        //Given the head = [1,2,3,4,5], n = 2 remove from the index n + 1
        // expected output [1,2,3,5]

        ListNode res = new ListNode(0, head);
        ListNode dummy = res;

        for(int i = 0; i < n; i++){
            head = head.next;
        }

        while (head != null){
            head = head.next;
            dummy = dummy.next;
        }

        dummy.next = dummy.next.next;

        return res.next;
    }

}
