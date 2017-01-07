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
int FindMergeNode(Node headA, Node headB) {
  // Complete this function
  // Do not write the main method. 
  
  int lengthA = getLength(headA);
  int lengthB = getLength(headB);
  Node tempB = headB;
  if(lengthA > lengthB) {
      int d = lengthA - lengthB;
      for(int i=0;i<d;i++){
          headA = headA.next;
      }
  } else {
      int d = lengthB - lengthA;
      for(int i=0;i<d;i++){
          headB = headB.next;
      }
  }
  
  /*if(headA != null && headB != null){
      for(int i=0;i<lengthA;i++){
          headB = tempB;
          for(int j=0;j<lengthB;j++) {
              if(headA == headB){
                  return headA.data;
              }
              headB = headB.next;
          }
          headA = headA.next;
      }
  }*/
  
  while(headA != null && headB != null){
      if(headA == headB){
          return headA.data;
      }
      headA = headA.next;
      headB = headB.next;
  }
  return 0;
}

int getLength(Node head) {
  int length = 0;
  if(head != null) {
      while(head != null){
          length++;
          head = head.next;
      }
  }
  return length;
}

