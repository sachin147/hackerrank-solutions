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

Node Delete(Node head, int position) {
// Complete this method
  Node current = head;
  Node previous = head;
  if(position == 0) {
      head = current.next;
      return head;
  }
  
  
  for(int i=0; i<position; i++) {
      previous = current;
      current = current.next;
  }
  
  previous.next = current.next;
  return head;

}


