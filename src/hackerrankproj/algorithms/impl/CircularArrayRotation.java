package hackerrankproj.algorithms.impl;

public class CircularArrayRotation {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        int []a = new int[n];
        int []position = new int[n];
        
        for(int i=0; i < n; i++){
            a[i] = sc.nextInt();
            position[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            position[i] = (position[i] + k)%n;
        }
        
        
        for(int i=0; i<q;i++) {
            int m = sc.nextInt();
            for(int j=0; j<n;j++) {
                if(position[j]== m){
                    System.out.println(position[j]);
                    break;
                }
            }
        }
    }
}
