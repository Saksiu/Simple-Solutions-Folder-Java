public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("b","abc"));
    }

    public static boolean isSubsequence(String s,String t) {
        int subcounter = 0;
        if(s.length()>0&&t.length()>0)
            for(int i = 0; i < t.length(); i++){
                if(subcounter<=s.length()-1&&t.charAt(i) == s.charAt(subcounter))
                    subcounter++;}
        else return s.length() == 0;
        return subcounter==s.length();
    }
}
