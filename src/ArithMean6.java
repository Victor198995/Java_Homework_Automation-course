import java.util.Arrays;

public class ArithMean6 {

    public static void main(String[] args) {

        int[] data = {206,430,73,30,293,322,42,36,447,229,36};

        System.out.println(Arrays.toString(data));

        int ElementsSum = 0;

        double ArMean;
        double  SDSum = 0;
        double SD;
       int[] median = new int[2];
       // int temp;

        //Sum of array elements

        for(int i = 0; i < data.length; i++){
        ElementsSum = ElementsSum + data[i];
        }
        ArMean = ElementsSum/data.length;

        //Standard deviation SUM
        for( int i = 0; i < data.length;i++){
            SDSum = SDSum + (Math.pow(ArMean - data[i],2));
        }
        SD = Math.sqrt(SDSum);

        //Median - array should be sorted, and value in middle should be printed



        for(int i = 0; i < data.length; i++){
            for(int j = 0; j < data.length - 1; j++){
                if(data[j]>data[j+1]){
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
        if(data.length % 2 == 0){
            median[0] = data[(data.length/2)-1];
            median[1] = data[(data.length/2)];}

         else{median[0] = data[(data.length/2)];}



        //Mode
        int maxAppearsNumber = 0;
        int maxAppearances = 0 ;
            for(int i = 0; i < data.length;i++){
                int count = 0;
                for(int j = 0; j < data.length;j++){
                    if(data[i] == data[j]){
                        count++;
                    }
                if(count > maxAppearances){
                    maxAppearsNumber = data[i];
                    maxAppearances = count;
                     }
                }

            }


        //Output

        System.out.println("Arithmetic mean = "+ ArMean);

        System.out.println("Standart deviation = "+ SD);

        System.out.println("Median = "+ Arrays.toString(median));

        System.out.println("Mode = " +  maxAppearsNumber);

    }
}
