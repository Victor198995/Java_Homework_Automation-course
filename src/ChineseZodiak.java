import java.util.Scanner;

public class ChineseZodiak {

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

            if (c == 0) {
                a = "Monkey";
            } else if (c == 1) {
                a = "Parrot";
            } else if (c == 2) {
                a = "Dog";
            } else if (c == 3) {
                a = "Pig";
            } else if (c == 4) {
                a = "Rat";
            } else if (c == 5) {
                a = "Bull";
            } else if (c == 6) {
                a = "Tiger";
            } else if (c == 7) {
                a = "Rabbit";
            } else if (c == 8) {
                a = "Dragon";
            } else if (c == 9) {
                a = "Snake";
            } else if (c == 10) {
                a = "Horse";
            } else if (c == 11) {
                a = "Goat";
            }

            if (d == 0 || d == 1) {
                b = "Grey";
            } else if (d == 2 || d == 3) {
                b = "Blue";
            } else if (d == 4 || d == 5) {
                b = "Green";
            } else if (d == 6 || d == 7) {
                b = "Red";
            } else if (d == 8 || d == 9) {
                b = "Yellow";
            }

            System.out.println(year + "is " + a + " " + b);
        } else {
            System.out.println("Type year from range!");
        }
    }
}
