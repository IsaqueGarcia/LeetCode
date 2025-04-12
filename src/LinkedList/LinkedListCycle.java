package LinkedList;

public class LinkedListCycle {

    public static void main(String[] args) {
        ListNode list1 =
                new ListNode(3,
                        new ListNode(2,
                                new ListNode(0,
                                        new ListNode(-4))));

        list1.next = list1;

        System.out.println(solution(list1));
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

    public static boolean solution(ListNode head) {

        ListNode rabbit = head; //O(1)
        ListNode turtle = head; //O(1)

        while(rabbit != null && rabbit.next != null){ // time O(n)
            rabbit = rabbit.next.next; //Run into the nodes 2 steps ahead
            turtle = turtle.next; //Run into the nodes step by step

            if(rabbit == turtle){ //If they match, so there a cycle
                return true;
            }
        }

        return false;
    }


}
