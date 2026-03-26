// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        Map<Integer,List<Integer>>map=new HashMap<>();
        Map<Integer,Integer>c=new HashMap<>();
        for(int i=1; i<=n; i++) {
            int val=in.nextInt();
            map.computeIfAbsent(val,k->new ArrayList<>()).add(i);
        }
        for(int i=1; i<=n; i++) {
            int val=in.nextInt();
            c.put(i,val);
        }
        int n1=in.nextInt();
        long sum=0;
        for(int i=0; i<n1; i++) {
            int q=in.nextInt();
            sum+=(findMax(0,q,new HashSet<>(),map,c));
        }
        System.out.println(sum);
    }
    private static long findMax(long sum, int node, Set<Integer>set,
        Map<Integer,List<Integer>>map,Map<Integer,Integer>c
    ) {
        if(set.contains(c.get(node))) return 0;
        set.add(c.get(node));
    
        if(map.containsKey(node)) {
            List<Integer>l=map.get(node);
            long temp=Long.MIN_VALUE;        
            for(int i:l) {
                long res=findMax(sum,i,set,map,c);
                temp=Math.max(temp,res);
            }
            set.remove(c.get(node));
            return temp+1;
            
        }
        set.remove(c.get(node));
        return sum+1;
    }
   
}