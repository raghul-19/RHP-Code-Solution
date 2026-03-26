// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        int[][] arr=new int[m][n];
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                arr[i][j]=in.nextInt();
            }
        }
        int max1=0, max2=0;
        for(int i=0; i<m; i++) {
            int lmax1=0;
            int lmax2=0;
            System.out.println(max1+" "+max2);
            for(int j=0; j<n; j++) {
                int sum=0;
                if(max1==0 || arr[i-1][j]!=max1) {
                    sum=max1+arr[i][j];
                } else {
                    sum=max2+arr[i][j];
                }
                arr[i][j]=sum;
                
                if(sum>lmax1) {
                    int temp=lmax1;
                    lmax1=sum;
                    lmax2=temp;
                } else {
                    lmax2=Math.max(lmax2,sum);
                }
                System.out.print(sum+" ");
            }
            System.out.print("\n");
            max1=lmax1;
            max2=lmax2;
            //System.out.println(max1+" "+max2);
        }
        System.out.print(max1);
    }
}