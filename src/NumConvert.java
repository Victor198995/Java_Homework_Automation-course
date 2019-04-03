public class NumConvert {


public void convert(int number){
    String a = "";
    String b = "";
    String c = "";
    String d = "";


    //Should be in another class

    int dozenNum = (number%100)/10;
    int remNum = number%10;
    int hunNum = (number%1000)/100;
    int thNum = number/1000;



//Thousends
                 switch(thNum){
        case 1: c = "one thousand";break;
        case 2: c = "two thousand";break;
        case 3: c = "three thousand";break;
        case 4: c = "four thousand";break;
        case 5: c = "five thousand";break;
        case 6: c = "six thousand";break;
        case 7: c = "seven thousand";break;
        case 8: c = "eight thousand";break;
        case 9: c = "nine thousand";break;
        case 10: c = "ten thousand";break;
    }
//Hundreds
                 switch(hunNum){
        case 1: d = "one hundred";break;
        case 2: d = "two hundred";break;
        case 3: d = "three hundred";break;
        case 4: d = "four hundred";break;
        case 5: d = "five hundred";break;
        case 6: d = "six hundred";break;
        case 7: d = "seven hundred";break;
        case 8: d = "eight hundred";break;
        case 9: d = "nine hundred";break;
    }

//Dozens
                 switch(dozenNum){
        //case 1: a = "ten";break;
        case 2: a = "twenty";break;
        case 3: a = "thirty";break;
        case 4: a = "fourty";break;
        case 5: a = "fifty";break;
        case 6: a = "sixty";break;
        case 7: a = "seventy";break;
        case 8: a = "eighty";break;
        case 9: a = "ninety";break;
        default: break;
    }

    //Remainder part
//Numbers 20-100 remaining part
                 switch(remNum){
        case 1: b = "one";break;
        case 2: b = "two";break;
        case 3: b = "three";break;
        case 4: b = "four";break;
        case 5: b = "five";break;
        case 6: b = "six";break;
        case 7: b = "seven";break;
        case 8: b = "eight";break;
        case 9: b = "nine";break;
        default: break;

    }
    //Numbers 10-19
                 if(dozenNum == 1&& remNum == 0){b = "ten";}
                 else if(dozenNum == 1&& remNum == 1){b = "eleven";}
                 else if(dozenNum == 1&& remNum == 2){b = "twelve";}
                 else if(dozenNum == 1&& remNum == 3){b = "thirteen";}
                 else if(dozenNum == 1&& remNum == 4){b = "fourteen";}
                 else if(dozenNum == 1&& remNum == 5){b = "fifteen";}
                 else if(dozenNum == 1&& remNum == 6){b = "sixteen";}
                 else if(dozenNum == 1&& remNum == 7){b = "seventeen";}
                 else if(dozenNum == 1&& remNum == 8){b = "eighteen";}
                 else if(dozenNum == 1&& remNum == 9){b = "nineteen";}
                 else if(thNum==0 && hunNum ==0 && dozenNum == 0 && remNum == 0){b = "zero";}



                     System.out.println(number +" is "+ c +" "+ d +" " +" "+ a +" "+ b);
                 }
         }

