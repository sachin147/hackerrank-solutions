package hackerrank.datastructure;

/*
class Node 
    int data;
    Node left;
    Node right;
*/
void top_view(Node root)
{
Node tempNode = root;
Node tempNode2 = root;
String ans = "";
if(root == null) {
   return;
}

while(tempNode != null) {
   //.out.print(tempNode.data+" ");
   ans = ans + tempNode.data+" ";
   tempNode = tempNode.left;
}
ans = new StringBuilder(ans).reverse().toString() + " ";
while(tempNode2 != null) {
   
   tempNode2 = tempNode2.right;
   if(tempNode2 != null) {
     //System.out.print(tempNode2.data+" ");    
       ans = ans + tempNode2.data+" ";
   }
   
}
System.out.print(ans.trim());

}

