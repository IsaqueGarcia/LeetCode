import org.w3c.dom.Node;

public class AddToNumbers {

    public static void main(String[] args) {

        ListNode list1 = new ListNode(2,  new ListNode(16, new ListNode(3)));
        ListNode list2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        addTwoNumbers(list1,list2).printAll();
    }


     public static class ListNode {
          int val;
          ListNode next;
          public ListNode(){}
          public ListNode(int val) { this.val = val;}
          public ListNode(int val, ListNode next) { this.val = val; this.next = next;}

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

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //Receive a two reserved linked list
        //Sum the values and return in a linked list reversed
        //Create a dummy to return all the result
        //Create a carry to leave the result if more than 10

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            int digit1 = l1 != null ? l1.val : 0;
            int digit2 = l2 != null ? l2.val : 0;

            int sum = digit1 + digit2 + carry;
            carry = sum / 10; //get the carry
            sum = sum % 10; //result

            ListNode newNode = new ListNode(sum);
            temp.next = newNode; //Add the result
            temp = temp.next; //Jump to the next node

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }

        return dummy.next;
    }

}
