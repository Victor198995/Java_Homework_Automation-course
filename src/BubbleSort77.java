import java.util.Arrays;

public class BubbleSort77 {

    public static void main(String[] args) {


        int[] arr = {12, 34, 57, 23, 9, 123, 345, 89,100,45};

        System.out.println(Arrays.toString(arr));
        //public static void swap
    //Ascending sort:
        for (int i = 0; i < arr.length ; i++){
            for(int j = 0; j < arr.length - 1; j++){
                //Swapping
                if (arr[j] > arr [j + 1]){
                       int tmp = arr[j];
                       arr[j] = arr[j + 1];
                       arr[j+1]=tmp;
                }
            }
}

    //Array output ascending
        System.out.println("Ascending array:");
        System.out.println(Arrays.toString(arr));




    // Descending sort
        for(int i = 0 ; i < arr.length;i++){
            for(int j = 0; j < arr.length -1; j++){
                if(arr[j] < arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }

            }
        }

        //Array output desscending
        System.out.println("Descending array:");
        System.out.println(Arrays.toString(arr));



    }
}


