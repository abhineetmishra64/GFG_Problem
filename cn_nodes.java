import java.utils.*;
class Node{
    int data;
    Node next;

    Node(int a){
        data = a;
        next = null;
    }
}

class Solution
{
    //Function to count nodes of a linked list.
    public static int getCount(Node head)
    {       
        //Code here
        int count = 0;
        if(head == null){
            return 0;
        }
        Node curr;
        for(curr=head;curr!=null;curr=curr.next){
            count++;
        }
        return count;
    }
}

class cb_nodes{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = new Node(sc.nextInt());
        Node tail = head;
        for(int i=0;i<n-1;i++){
            tail.next = new node(sc.nextInt);
            tail = tail.next;
        }
        Solution ob = new Solution();
        System.out.pritnln(ob.getCount(head));
    }
}
