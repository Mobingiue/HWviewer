package test.java;

public class swapPairs {

    public static void main(String[] args) {

        ListNode head =new ListNode(1,new ListNode(2));
        head =swapPairs(head);
    }

    public static ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode there_node = head;
        ListNode next_node = head.next;
        ListNode before_node = head;

        there_node.next = next_node.next;
        next_node.next = there_node;
        head = next_node;//交换前两个

        before_node = there_node;
        there_node = there_node.next;

        for(;there_node != null && there_node.next != null;){
            next_node = there_node.next;

            before_node.next = next_node;
            there_node.next = next_node.next;
            next_node.next = there_node;

            before_node =there_node;
            there_node = there_node.next;

        }

        return head;
    }



    public static class ListNode {
        int val;
        ListNode next =null;
        ListNode(){}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val; this.next = next;
        }
    }
}


