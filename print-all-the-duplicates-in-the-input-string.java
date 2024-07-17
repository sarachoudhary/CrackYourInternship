import java.util.*;

public class proelevate {

    public static void printDuplicates(String str){
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(hm.containsKey(str.charAt(i))){
                hm.put(str.charAt(i),hm.get(str.charAt(i))+1);
            } else {
                hm.put(str.charAt(i),1);
            }
        }
        for (Character key : hm.keySet()) {
            char character = key;
            int val = hm.get(key);
            System.out.println(character + " : " + val);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printDuplicates(str);
    }
}
