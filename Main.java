// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) {
            arr[i]=in.nextInt();
        }
        long max=arr[0];
        long sum=0;
        for(int i=0; i<n; i++) {
            sum+=arr[i];
             max=Math.max(sum,max);
            if(sum<0) {
                sum=0;
            }
        }
        System.out.println(max);
    }
}