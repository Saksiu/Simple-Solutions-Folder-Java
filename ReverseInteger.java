public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverseInteger(1534236));
    }

    public static int reverseInteger(int x){
        if(x<=Integer.MIN_VALUE||x>=Integer.MAX_VALUE)
            return 0;
        int y=Math.abs(x);
        StringBuilder str= new StringBuilder();
        for(int i=Integer.toString(y).length()-1;i>=0;i--)
            str.append(Integer.toString(y).charAt(i));
        if(Long.parseLong(str.toString())>=Integer.MAX_VALUE
                ||Long.parseLong(str.toString())<=Integer.MIN_VALUE)
            return 0;
        if(x<0)
            return Integer.parseInt(str.toString())*-1;
        return Integer.parseInt(str.toString());
    }
}
