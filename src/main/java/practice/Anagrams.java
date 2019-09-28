package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a.toLowerCase();
        b.toLowerCase();

        Map<Character, Integer> map=new HashMap();
        for(int i=0;i<b.length();i++){
            char letter=b.charAt(i);
            if(!map.containsKey(letter)){
                map.put(letter,1);
            }
            else {
                Integer frequency=map.get(letter);
                map.put(letter,++frequency);
            }
        }

        for (int j=0;j<a.length();j++){
            char letter=a.charAt(j);
            if(!map.containsKey(letter)){
                return false;
            }

            Integer frequency=map.get(letter);

            if(frequency==0){return false;}
            else{map.put(letter,--frequency);}
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }


}
