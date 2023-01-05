/*
class Node{
  int data;
  Node next;
  
  Node(int data){
    this.data = data;
    this.next = null;
  }
}
*/
class Solution{
  public Node addTwoLinkedList(Node head1,Node head2){

        Node head = null;
        Node temp = null;

        int c = 0;

        while (head1 != null || head2 != null) {
             int sum = c;
            if (head1 != null) {
                sum += head1.data;
                head1  = head1.next;
            }
            if (head2 != null) {
                sum += head2.data;
                head2 = head2.next;
            }
 
            Node node = new Node(sum % 10);
            c = sum / 10;
            
            if (temp == null) {
                temp = head = node; }
           
            else {
                temp.next = node;
                temp = temp.next;}
        }

        if (c > 0) {
            temp.next = new Node(c);
        }
        return head;
  }
}
