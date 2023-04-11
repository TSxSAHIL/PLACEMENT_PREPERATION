import java.util.*;
public class Q5D1 {
    public static void main(String[] args) {
        // 1> Brute Force Approach -> Time Complexity 0(n^2)
        /* Approach -> 
            Use a for loop of ‘i’ from 0 to n.
            Use another for loop of j from ‘i+1’ to n.
            If arr[j] > arr[i] , take the difference and compare  and store it in the maxPro variable.
            Return maxPro.
        */
        int arr[] = {7,6,4,3,1};
        int n = arr.length;
        int maxpro = 0;
        for(int i = 0 ; i<n;i++){
            for(int j=i+1 ; j<n ; j++){
                if (arr[j] > arr[i]) {
                    maxpro = Math.max(arr[j] - arr[i], maxpro);
                }
            }
            
        }
        System.out.println(maxpro);

        // 2> 
        
    }
    
}
