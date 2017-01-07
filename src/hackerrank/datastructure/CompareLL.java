package hackerrank.datastructure;

/*
Compare two linked lists A and B
Return 1 if they are identical and 0 if they are not. 
Node is defined as 
class Node {
   int data;
   Node next;
}
*/
int CompareLists(Node headA, Node headB) {
  // This is a "method-only" submission. 
  // You only need to complete this method 
  if((headA == null && headB != null) ||(headA != null && headB == null) || (headA == null && headB == null) ) {
      return 0;
  } else if(headA.next == null && headB.next == null) {
      if(headA.data == headB.data) {
          return 1;
      } else {
          return 0;
      }
  } else {
      int Alength = 0;
      int Blength = 0;
      int isSame = 0;
      
      while(headA.next != null) {
          Alength++;
          headA = headA.next;
      }
      
      while(headB.next != null) {
          Blength++;
          headB = headB.next;
      }
      
      if(Alength != Blength) {
          return 0;
      } else {
          while(headA != null && headB != null){
              if(headA.data != headB.data) {
                  return 0;            
              } 
              headA = headA.next;
              headB = headB.next;
          }
          return 1;
      }
          
  }
  
  

}
