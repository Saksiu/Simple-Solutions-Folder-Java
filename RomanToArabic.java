import java.util.Scanner;

public class RomanToArabic {
    public static void main(String[] args) {    //A program converting any given number of the range between [1-4999]
        Scanner in= new Scanner(System.in);     //from roman to arabic number system assuming the given data is correct

        String str=in.nextLine();
        System.out.println(romanToInt(str));   //calling the converter function
    }
    public static int romanToInt(String s){
        int number=0;
        char prevChar=0;
        boolean isLast=false, skip;
        char[] charArr=s.toCharArray();         //initializing variables and converting the given String into a char array type

        for(int i=charArr.length-1;i>=0;i--){   //main loop of the function

            skip=true;

            if(i<=0)
                isLast=true;
            if(!isLast)
                prevChar=charArr[i-1];

            switch (charArr[i]){
                case 'I'-> {
                    number++;
                    skip=false;
                }
                case 'V'-> {
                    if(prevChar=='I'&&!isLast)
                        number+=4;
                    else {
                        number+=5;
                        skip=false;
                    }
                }
                case 'X'-> {
                    if(prevChar=='I'&&!isLast)
                        number+=9;
                    else {
                        number+=10;
                        skip=false;
                    }
                }
                case 'L'-> {        //using switch cases inside switch cases, how clever!
                    if(!isLast)
                        switch (prevChar){
                            case 'X'->number+=40;
                            case 'V'->number+=45;
                            case 'I'->number+=49;
                            default -> {number+=50;skip=false;}
                        }
                    else
                        number+=50;
                }
                case 'C'-> {
                    if(!isLast)
                        switch (prevChar){
                            case 'X'->number+=90;
                            case 'V'->number+=95;
                            case 'I'->number+=99;
                            default -> {number+=100;skip=false;}
                        }
                    else
                        number+=100;
                }
                case 'D'-> {
                    if(!isLast)
                        switch (prevChar){
                            case 'C'->number+=400;
                            case 'L'->number+=450;
                            case 'X'->number+=490;
                            case 'V'->number+=495;
                            case 'I'->number+=499;
                            default -> {number+=500;skip=false;}
                        }
                    else
                        number+=500;
                }
                case 'M'-> {
                    if(!isLast)
                        switch (prevChar){
                            case 'C'->number+=900;
                            case 'L'->number+=950;
                            case 'X'->number+=990;
                            case 'V'->number+=995;
                            case 'I'->number+=999;
                            default -> {number+=1000;skip=false;}
                        }
                    else
                        number+=1000;
                }
            }
            if(skip)
                i--;
        }
        return number;
    }
}