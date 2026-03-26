// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        Map<Character,Integer>left=new HashMap<>();
        Map<Character,Integer>right=new HashMap<>();
        for(char ch:str.toCharArray()) {
            right.put(ch,right.getOrDefault(ch,0)+1);
            left.put(ch,0);
        }
        int count=0;
        for(char ch:str.toCharArray()) {
            right.put(ch,right.get(ch)-1);
            for(char l:left.keySet()) { 
                if(left.get(l)>0) {
                    for(char r:right.keySet()) {
                        if(l==r && right.get(r)>0) {
                            count+=(left.get(l)*right.get(r));
                            break;
                        }
                    }
                }
            }
            left.put(ch,left.get(ch)+1);
        }
        System.out.println(count);
    }
}