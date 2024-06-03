public class merge {

    private Node merge (Node  head1,Node head2)
    {
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while(head! != null && head != null) {
            if(head1.data < head2.data)
            {
                temp.next = head1;
                head1 = head1.next;
            }
            else
            {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
    
    }
    public Node mergeSort(Node head)
    {
        if(head ==null && head.next != null)
        {
            return head;
        }
        Node mid =getMid();
        Node righthead = mid.next;
        mid.next=null;
        Node newLeft =mergeSort(head);
        Node newRight =mergeSort(righthead);


    }
    public static void main(String[] args)
    {

    }
}
}
