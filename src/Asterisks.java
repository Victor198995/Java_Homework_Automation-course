public class Asterisks {

    public static void main(String[] args) {

        for(int i = 0; i < 5; i++){

            for(int j = 0;  j < 5; j++){

                if(i <j){System.out.print("*");}
                else if (j == 0){System.out.print("1");}
                else if (j == 1){System.out.print("2");}
                else if (j == 2){System.out.print("3");}
                else if (j == 3){System.out.print("4");}
                else if (j == 4){System.out.print("5");}
            }
            System.out.println(" ");
        }
    }
}
