import java.util.Scanner;

public class NumberToWord2 {

    public static void main(String[] args) {
        int rem;
        int in;

        String a = "";
        String b = "";

//VNumber input
        System.out.println("Please enter a number from 9980 to 10000");

        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();

        //Input validation
        if(number >=9980 && number <=10000) {

            in = number/10;
            rem = number%10;

            if(in == 998){a = "Nine thousand nine hundred eighty";}
            else if(in == 999){a = "Nine thousand nine hundred ninety";}
            else if(in == 1000){ a = "Ten thousand";}


            if(rem == 1){b = "one";}
            else if(rem == 2){b = "two";}
            else if(rem == 3){b = "three";}
            else if(rem == 4){b = "four";}
            else if(rem == 5){b = "fve";}
            else if(rem == 6){b = "six";}
            else if(rem == 7){b = "seven";}
            else if(rem == 8){b = "eight";}
            else if(rem == 9){b = "nine";}


            System.out.println( number +" is " + a +" "+ b);
        }
        else{System.out.println("Please,type number from  defined range");}
        }
    }

