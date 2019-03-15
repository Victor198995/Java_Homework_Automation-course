import java.util.Scanner;

public class Squarerootupg {

        public static void main(String[] args) {

            double a,b,c;
            double x1,x2;

            double D;

//Input values
            System.out.println("Input values for ax*x+b*x+c = 0:");
            Scanner scan = new Scanner(System.in);

            System.out.println("Input value for  a:");
            a = scan.nextInt();

            System.out.println("Input value for  b:");
            b = scan.nextInt();

            System.out.println("Input value for  c:");
            c = scan.nextInt();


//Resolution
            D = Math.pow(b,2)-4*a*c;

            x1 = (-b+Math.sqrt(D))/(2*a);

            x2 = (-b-Math.sqrt(D))/(2*a);
//Output conditions
            if (D > 0){
                System.out.println("Equation has 2 resolutions:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
            else if (D == 0) {
                System.out.println("Equation has 1 resolution:");
                System.out.println("x1,x2 = " + x1);
            }
            else{System.out.println("Equation has no resolution");
            }


        }
    }

