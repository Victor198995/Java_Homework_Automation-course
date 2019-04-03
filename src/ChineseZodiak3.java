import java.util.Scanner;

public class ChineseZodiak3 {

    public static void main(String[] args) {
        //Animal
        String a = "";
        //Color
        String b = "";

        int c;
        int d;

//Input year
        System.out.println("Please, enter year from  0 to 2019: ");

        Scanner scan = new Scanner(System.in);

        int year = scan.nextInt();

        if (year >= 0 && year <= 2019) {
//Calculating years from 16 to 2019
            //Animal logic
            c = year % 12;
            //Color logic
            d = year % 10;



            switch(c) {
                case 0:
                    a = "Monkey";
                    break;
                case 1:
                    a = "Parrot";
                    break;
                case 2:
                    a = "Dog";
                    break;
                case 3:
                    a = "Pig";
                    break;
                case 4:
                    a = "Rat";
                    break;
                case 5:
                    a = "Bull";
                    break;
                case 6:
                    a = "Tiger";
                    break;
                case 7:
                    a = "Rabbit";
                    break;
                case 8:
                    a = "Dragon";
                    break;
                case 9:
                    a = "Snake";
                    break;
                case 10:
                    a = "Horse";
                    break;
                case 11:
                    a = "Goat";
                    break;
            }


        switch(d) {
            case 0:
            case 1:
                b = "Grey";
                break;
            case 2:
            case 3:
                b = "Blue";
                break;
            case 4:
            case 5:
                a = "Green";
                break;
            case 6:
            case 7:
                b = "Red";
                break;
            case 8:
            case 9:
                b = "Yellow";
                break;
        }

            System.out.println(year + "is " + a + " " + b);
       } else{
               System.out.println("Type year from range!");
            }

    }
}
