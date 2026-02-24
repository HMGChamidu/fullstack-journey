public class ReverseArrayProf {

    public static void main(String[] args){
        int[] arr = {4,9,2,7,5};

        int start= 0 ;
        int end = arr.length-1;

        while( start < end ){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end -- ;

        }
        System.out.println("Reverse array: ");

        for(int num : arr){
            System.out.println(num);
        }
    }
}
