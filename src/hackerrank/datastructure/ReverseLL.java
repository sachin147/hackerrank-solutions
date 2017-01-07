package hackerrank.datastructure;

/*
Insert Node at the end of a linked list 
head pointer input could be NULL as well for empty list
Node is defined as 
class Node {
   int data;
   Node next;
}
*/
  // This is a "method-only" submission. 
  // You only need to complete this method. 
Node Reverse(Node head) {

  if(head == null || head.next == null) {
      return head;
  }
  
  Node previousNode = null;
  Node nextNode;
  while(head != null) {
      nextNode = head.next;  
      head.next = previousNode;  
      previousNode = head;  
      head = nextNode;
  }
  return previousNode;
}

