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
  
int GetNode(Node head,int n) {
   // This is a "method-only" submission. 
   // You only need to complete this method. 
  List<Integer> nodeList = new ArrayList<Integer>();
  if(head == null) {
      return 0;
  }
  while(head != null) {
      nodeList.add(head.data);
      head = head.next;
  }
  return nodeList.get(nodeList.size() - n - 1);
  
}
