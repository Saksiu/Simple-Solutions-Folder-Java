public class FirstOccurence {
    public static void main(String[] args) {
        String haystack="randoeeeerandomeeeeeeeedom",needle="random";
        System.out.println(firstOccurence(haystack, needle));
    }
    public static int firstOccurence(String haystack, String needle){
        for(int i=0;i<haystack.length();i++)
            if(haystack.charAt(i)==needle.charAt(0))    //found first matching letter
                if(foundFirstLetter(haystack, needle, i))
                    return i;
        return -1;
    }
    public static boolean foundFirstLetter(String haystack,String needle,int contact){
        for(int i=0;i<needle.length();i++)  //contact as in index of first matching letter
            if(contact+i>=haystack.length()||!(haystack.charAt(contact+i)==needle.charAt(i)))//verifying the
                return false;
        return true;
    }
}
