//move all the zero at the end of the array without changing the order of array

class Day2 {
    static void pushZerosToEnd(int[] arr) {
        // code here
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
        }
        for(int i=j;i<arr.length;i++){
            arr[i]=0;
        }
        
    }
    public static void main(String args[]){
        int[] arr={1,0,2,0,3,4};
        pushZerosToEnd(arr);
    }
}
