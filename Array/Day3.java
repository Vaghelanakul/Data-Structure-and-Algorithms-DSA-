class Day3 {
    
    //Function for reversing an array
    public static void reverseArr(int[] arr){
        int startIndex=0;
        int endIndex=arr.length-1;
        while(startIndex<endIndex){
            int temp=arr[startIndex];
            arr[startIndex]=arr[endIndex];
            arr[endIndex]=temp;
            startIndex++;
            endIndex--;
        }
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        reverseArr(arr);

    }
}