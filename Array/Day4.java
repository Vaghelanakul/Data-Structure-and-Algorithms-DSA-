    // User function Template for Java
    
    class Solution {
        
        //Function for reversing an array
        public static void reverseArr(int[] arr ,int startIndex,int endIndex){
            while(startIndex<endIndex){
                int temp=arr[startIndex];
                arr[startIndex]=arr[endIndex];
                arr[endIndex]=temp;
                startIndex++;
                endIndex--;
            }
        }
        
        // Function to rotate an array by d elements in counter-clockwise direction.
        static void rotateArr(int arr[], int d) {
            
            int n=arr.length;
            d%=n;
            
            // add your code here
            reverseArr(arr,0,d-1);
            
            reverseArr(arr,d,n-1);
            
            reverseArr(arr,0,n-1);
            
            // for(int i=0;i<arr.length;i++){
            //     System.out.print(arr[i]);
            // }
        }
        
        public static void main(String[] args){
            
            int[] arr= {1,2,3,4,5};
            int d=2;
            rotateArr(arr,d);
            
        }
    }