/*
 * Copyright (c)  2023 by Sanidhya Varshney
 */

public class MergeSortedLinkedLists {
    static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node sortedMerge(Node head1, Node head2) {
        Node dummy=new Node(0);
        Node tail=dummy;
        while(true){
            if(head1==null){
                tail.next=head2;
                break;
            }
            if(head2==null){
                tail.next=head1;
                break;
            }

            if(head1.data<=head2.data){
                tail.next=head1;
                head1=head1.next;
            }
            else{
                tail.next=head2;
                head2=head2.next;
            }
            tail=tail.next;
        }
        return dummy.next;
    }
}
