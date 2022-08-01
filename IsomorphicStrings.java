import java.util.Map;
import java.util.TreeMap;

public class IsomorphicStrings {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("badc","baba"));
    }
    public static boolean isIsomorphic(String s, String t){
        Map<Character,Character> charMap=new TreeMap<>();
        for(int i=0;i<s.length();i++){
            if(!charMap.containsValue(t.charAt(i)))
                charMap.putIfAbsent(s.charAt(i),t.charAt(i));
            if(charMap.get(s.charAt(i))==null||charMap.get(s.charAt(i))!=t.charAt(i))
                return false;
        }
        return true;
    }


}
