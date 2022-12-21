public class FindMissingAndRepeating {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int[] ans = new int[2];
        int[] freq = new int[n+1];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        for(int i=1;i<=n;i++){
            if(freq[i]==2){
                ans[0] = i;
            }
            if(freq[i]==0){
                ans[1]=i;
            }
        }
        return ans;
    }
}
