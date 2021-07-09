import java.util.*;
// import java.util

class Node{
    int data;
    Node next;

    Node(int key){
        data = key;
        next = null;
    }
}

class cn_pair1
{
    //Function to count nodes of a linked list.
    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2, int x) {
        // add your code here
        Set<Integer> set = new HashSet<>();
        for(int i: head1)
        {
            set.add(i);
        }
        int c = 0;
        for(int i: head2)
        {
            if(set.contains(x-i))
                c++;
        }
        return c;
    }
}

class cn_pair{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        Integer arr1[] = new Integer[n1];
        for(int i=0;i<n1;i++) arr1[i] = sc.nextInt();
        int n2 = sc.nextInt();
        Integer arr2[] = new Integer[n2];
        for(int i=0;i<n2;i++) arr2[i] = sc.nextInt();
        LinkedList<Integer> head1 = new LinkedList<>(Arrays.asList(arr1));
        LinkedList<Integer> head2 = new LinkedList<>(Arrays.asList(arr2));

        int x = sc.nextInt();
        cn_pair1 gfg = new cn_pair1();
        System.out.println(gfg.countPairs(head1, head2, x));
    }
}