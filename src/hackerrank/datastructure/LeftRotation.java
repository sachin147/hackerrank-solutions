package hackerrank.datastructure;

public class LeftRotation {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int []a = new int[n];
        
        for(int i=0; i<n; i++) {
            a[i]=sc.nextInt();
        }
        
        if(d > 0) {
            for(int i=1; i<=d; i++) {
                int temp = a[0];
                for(int j=0; j<n-1; j++) {                    
                    a[j] = a[j+1];
                }
                a[n-1]=temp;
            }    
        }
        
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
    }
}
