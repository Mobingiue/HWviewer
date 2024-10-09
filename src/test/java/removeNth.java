package test.java;

public class removeNth {

    public static void main(String[] args) {
        ListNode node =new ListNode(2);
        ListNode head =new ListNode(1,node);
        head =removeNthFromEnd(head,1);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode now_node = head;
        ListNode pass_node = null;
        int N=0;
        if (head.next == null) return null;
        for (int i=1;now_node != null;i++){
            now_node = now_node.next;
            N=i;
        }
        pass_node = head;
        now_node = head.next;
        if(N==n) return head.next;
        for (int i=0;i<N;i++){

            if(i+1 == N-n){

                pass_node.next =now_node.next;
                return head;
            }

            pass_node = now_node;
            now_node = now_node.next;

        }
        return null;
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


