
import java.util.*;
public class CheckAllLowerCaseAlphabets {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String sc=s.nextLine();
        int flag=0;
        for(int i=0;i<sc.length();i++){
           flag|=1<<(sc.charAt(i)-'a');
        }
       System.out.println(flag==((1<<26)-1));
    }
}