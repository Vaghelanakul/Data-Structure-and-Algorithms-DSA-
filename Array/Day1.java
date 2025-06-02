//find the second largest non zero element from the array

class Day1 {
    public static int getSecondLargest(int[] arr) {
        // code here
        if(arr.length<2){
            return -1;
        }
        int largest=-1;
        int secondLargest=-1;
        for(int i:arr){
            if(i>largest){
                secondLargest=largest;
                largest=i;
            }
            else if(i>secondLargest && i<largest){
                secondLargest=i;
            }
        }
        return (secondLargest==-1 ? -1 : secondLargest);
    }
    public static void main(String args[]){
        int[] arr={12,35,1,10,34,1};
        System.out.println(getSecondLargest(arr));
    }
        
}
