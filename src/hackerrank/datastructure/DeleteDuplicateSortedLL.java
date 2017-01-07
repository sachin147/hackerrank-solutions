package hackerrank.datastructure;

/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method. 
    Node temp = head;
    if(head == null) {
        return head;
    }
    while(temp.next != null) {
        if(temp.next != null && temp.next.data == temp.data) {
            temp.next = temp.next.next;
        } else {
            temp = temp.next;
        }
    }
    return head;
}

