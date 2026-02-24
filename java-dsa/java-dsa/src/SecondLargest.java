public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {5,5,5,6};

        if(arr.length<2){
            System.out.printf("No Second Largest Element. ");
            return;
        }
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int num : arr){

            if(num > max){
                secondMax = max;
                max = num;
            }
            else if(num > secondMax && num != max){
                secondMax = num;
            }
        }
        if (secondMax == Integer.MIN_VALUE){
            System.out.printf("No Second Largest Element. ");
        }
        else{
            System.out.printf("Second largest number is: "+secondMax);
        }
    }

}