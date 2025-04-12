package LinkedList;

public class MergeTwoList {

    public static void main(String[] args) {

        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        list1.printAll();
        list2.printAll();

        solution(list1, list2).printAll();

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

        public void printAll(){
            String print = "[";
            ListNode temp = this;
            while(temp.next != null){
                print = print.concat(String.valueOf(temp.val)).concat(", ");
                temp = temp.next;
            }
            print = print.concat(String.valueOf(temp.val)).concat("]");
            System.out.println(print);
        }
    }

    public static ListNode solution(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(); // The dummy keep the cursor on begin
        ListNode temp =  dummy;

        while(list1 != null && list2 != null){
            if(list1.val > list2.val){
                temp.next = list2;
                list2 = list2.next;
            }else{
                temp.next = list1;
                list1 = list1.next;
            }
            temp = temp.next;
        }

        temp.next = (list1 != null) ? list1 : list2; //Add the last number of list

        return dummy.next; //Returns the dummy contain's all the values
    }
}
