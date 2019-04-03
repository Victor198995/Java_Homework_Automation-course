import java.util.Scanner;

public class FindIndex5 {

    public static void main(String[] args) {

        int number;

        boolean found = false;

        int[] arr = {158,207,392,62,315,434,487,268,405,241};

        //Number input

        System.out.println("Please enter a value from array {158,207,392,62,315,434,487,268,405,241}:");

        Scanner scan = new Scanner(System.in);

        number = scan.nextInt();


        //Sorting out
      for(int i = 0; i < arr.length;i++){
        if(number == arr[i]){
          found = true;
          System.out.println("Index of element found is "+ i);
         }
        }
        if(found == false){System.out.println("There is no such number in current array");}
    }
   }
