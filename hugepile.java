// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int q=in.nextInt();
        for(int i=0; i<q; i++) {
            int n=in.nextInt();
            Map<Integer,Integer>map=new HashMap<>();
            int k=in.nextInt();
            int count=dfs(n,map,k);
            System.out.println(count==Integer.MAX_VALUE?-1:count);
        }
    }
    private static int dfs(int num,Map<Integer,Integer>map,int k) {
        if(num==k) return 0;
        if(num<k) return Integer.MAX_VALUE;
        if(map.containsKey(num)) return map.get(num);
        int val1=num/2;
        int val2=num-val1;
        int count1=dfs(val1,map,k);
        int count2=dfs(val2,map,k);
        int result=Math.min(dfs(val1,map,k),dfs(val2,map,k));
        if(result==Integer.MAX_VALUE) {
            map.put(num,result);
            return result;
        }
        map.put(num,result+1);
        return result+1;
    }
}