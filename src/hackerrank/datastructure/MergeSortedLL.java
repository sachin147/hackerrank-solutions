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

Node MergeLists(Node headA, Node headB) {
   // This is a "method-only" submission. 
   // You only need to complete this method 
  Node temp1 = headA;
  Node temp2 = headB;
  
  Node mergedList = new Node();
  Node newTemp = mergedList;
  
  while(temp1 != null && temp2 != null) {
      if(temp1.data < temp2.data) {
          newTemp.next = temp1;
          temp1 = temp1.next;
      } else {
          newTemp.next = temp2;
          temp2 = temp2.next;
      }
      newTemp = newTemp.next;
  }
  
  if(temp1 != null) {
      newTemp.next = temp1;
  }
  if(temp2 != null) {
      newTemp.next = temp2;
  }
   
  return mergedList.next;

}

