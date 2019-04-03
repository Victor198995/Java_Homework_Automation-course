import java.util.Scanner;

public class NumberToWord4 {

    public static void main(String[] args) {

//Creating an object
        NumConvert num = new NumConvert();
//Convert number
        System.out.println("Input number from 0 to 10000:");
        Scanner scan = new Scanner(System.in);

        num.convert(scan.nextInt());
//Output 0-150
        System.out.println("");
        System.out.println("Additional task:");
        System.out.println("Numbers from 0 to 150");

        for(int number = 0;number<=150;number++){
            num.convert(number);
            }

        System.out.println("");
        System.out.println("Numbers from 9980 to 10000");

//Output 9980-10000
        for(int number = 9980; number <=10000; number++){
            num.convert(number);
        }

       }

    }

