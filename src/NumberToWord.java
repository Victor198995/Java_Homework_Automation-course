import java.util.Scanner;

public class NumberToWord {

    public static void main(String[] args) {

        int rem;
        int in;

        String a = "";
        String b = "";

//VNumber input
        System.out.println("Please enter a number from 10 to 150");

        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();

        //Input validation
             if(number >=10 && number <=150){

//Condition

      //Integer part
        in = number/10;
        rem = number%10;

//Numbers 10-19
        if(in == 1&& rem == 0){b = "ten";}
        else if(in == 1&& rem == 1){b = "eleven";}
        else if(in == 1&& rem == 2){b = "twelve";}
        else if(in == 1&& rem == 3){b = "thirteen";}
        else if(in == 1&& rem == 4){b = "fourteen";}
        else if(in == 1&& rem == 5){b = "fifteen";}
        else if(in == 1&& rem == 6){b = "sixteen";}
        else if(in == 1&& rem == 7){b = "seventeen";}
        else if(in == 1&& rem == 8){b = "eighteen";}
        else if(in == 1&& rem == 9){b = "nineteen";}


//Numbers 20-150 integer part
        if(in ==2){a = "twenty";}
        else if(in ==3){a = "thirty";}
        else if(in ==4){a = "fourty";}
        else if(in ==5){a = "fifty";}
        else if(in ==6){a = "sixty";}
        else if(in ==7){a = "seventy";}
        else if(in ==8){a = "eighty";}
        else if(in ==9){a = "ninety";}
        else if(in ==10){a = "one hundred";}
        else if(in ==11){a = "one hundred";}
        else if(in ==12){a = "one hundred twenty";}
        else if(in ==13){a = "one hundred thirty";}
        else if(in ==14){a = "one hundred fourty";}
        else if(in ==15){a = "one hundred fifty";}

        //Remainder part

//Numbers 20-150 remaining part


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
