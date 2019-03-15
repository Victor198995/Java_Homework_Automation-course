public class SquareRoot {

    public static void main(String[] args) {

        double a,b,c;
        double x1,x2;

//Setting values to variables
        a = -1;
        b = 1;
        c = -12;

//Resolution
        x1=(-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);

        x2=(-b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
//
        System.out.println("Resolution of equation is following:");
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);

    }
}


