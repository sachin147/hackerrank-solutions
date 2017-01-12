package hackerrank.datastructure;

public class DynamicArray {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        
        List<Integer>[] seqList = new ArrayList[N];
        
        for(int i=0; i<N; i++) {
            seqList[i] = new ArrayList<>();
        }
        
        int lastAns = 0;
        
        for(int i=0; i<Q; i++) {
            int queryType = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            if(queryType == 1) {
                operateQueryOne(seqList);
            } else {
                operateQueryTwo();          
            }
        }
    }
    
    
    public static void operateQueryOne(seqList) {
        
    }
    
    public static void operateQueryTwo(seqList) {
        
    }
}
