package LinkedList;

public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode list1 =
                new ListNode(4,
                        new ListNode(3,
                                new ListNode(2,
                                        new ListNode(1))));

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
        //Reverse the linked list
        //Input 4, 3, 2, 1
        //Output 1, 2 ,3 ,4

        ListNode reversedList = null;

        while(head != null){
            ListNode temp = head.next;
            head.next = reversedList;
            reversedList = head;
            head = temp;
        }

        return  reversedList;
    }


}
