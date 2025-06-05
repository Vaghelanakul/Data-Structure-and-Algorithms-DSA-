// User function Template for Java

class Day5 {
    
    static void nextPermutation(int[] arr) {
        // code here
        int n=arr.length;
        int pivot =-1;
        for(int i=n-2;i>=0;i--){
            
            if(arr[i]<arr[i+1]){
                pivot=i;
                break;
            }
            
        }
        if(pivot==-1){
            reverseArray(arr,0,n-1);
            return;
            
        }
        for(int i=n-1;i>pivot;i--){
            if(arr[i]>arr[pivot]){
                int temp=arr[i];
                arr[i]=arr[pivot];
                arr[pivot]=temp;
                break;
            }
        }
        
        reverseArray(arr,pivot+1,n-1);
        
        
    }
    
    static void reverseArray(int[] arr,int startIndex,int endIndex){
        
        while(startIndex<endIndex){
            int temp=arr[startIndex];
            arr[startIndex]=arr[endIndex];
            arr[endIndex]=temp;
            startIndex++;
            endIndex--;
        }
        
    }
    public static void main(String[] args){
        int[] arr={2,4,1,7,5,0};
        nextPermutation(arr);
    }
}
