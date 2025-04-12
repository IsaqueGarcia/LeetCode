package LinkedList;

public class RemoveDuplicates {

    public static void main(String[] args) {
        ListNode list1 =
                new ListNode(1,
                        new ListNode(1,
                                new ListNode(2,
                                        new ListNode(3,
                                                new ListNode(3)))));

        solution(list1).printAll();
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

    public static ListNode solution(ListNode head) {
        /*
        Given the head of a sorted linked list,
        delete all duplicates such that each element appears only once.
        Return the linked list sorted as well.

        Input = 1, 1, 2, 3, 3
        Output = 1, 2, 3

         */

        ListNode result = head;

        while (head != null && head.next != null) {
            if (head.val == head.next.val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }

        return result;
    }


}
