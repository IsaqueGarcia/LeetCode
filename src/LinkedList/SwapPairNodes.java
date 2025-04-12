package LinkedList;

public class SwapPairNodes {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));

        swapPairs(list1).printAll();
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

    public static ListNode swapPairs(ListNode head) {
        //Input = 1,2,3,4
        if (head == null || head.next == null) return head;
        ListNode temp = head.next; //start the list with the second node 2
        head.next = swapPairs(temp.next); //send the next pair of nodes 3-4 but start
        temp.next = head; //get the first node on position 2, so get 1
        return temp; //return output 2,1,4,3
    }


}
