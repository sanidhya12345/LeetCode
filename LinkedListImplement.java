import java.util.*;
class Node{
    public int data;
    public Node link=null;
    public Node(int data){
        this.data=data;
    }
}
public class LinkedListImplement {
    static Node head=null;
    public static void createList(int data){
       Node newNode=new Node(data);
       if(head==null){
        head=newNode;
       }
       Node curr=head;
       while(curr.link!=null){
        curr=curr.link;
       }
       curr.link=newNode;
       newNode.link=null;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        createList(data);
        while(data!=-1){
            if(data!=-1){
                data=sc.nextInt();
                createList(data);
            }
        }
        Node cur=head;
        while(cur!=null){
            System.out.println(cur.data);
            cur=cur.link;
        }
    }
}