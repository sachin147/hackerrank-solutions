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

Node InsertNth(Node head, int data, int position) {
  Node newNode = new Node();
  newNode.data = data;
  newNode.next = null;
  
  if(position == 0) {
      newNode.next = head;
      head = newNode;
      return head;
  }
  
  Node temp = head;
  
  for(int i=0;i<position-1;i++) {
      temp = temp.next;
  }
  
  newNode.next = temp.next;
  temp.next = newNode;
  
  return head;
  
}
