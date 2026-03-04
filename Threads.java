
import java.util.*;
class Process extends Thread
{
    int n;
    Process(int n)
    {
        this.n=n;
    }
    public void run()
    {
        doSubProcess();
    }
    public void doSubProcess()
    {
        for(int i=1;i<=n;i++)
        System.out.println("Doing process "+n+" with "+i);
    }
}
public class Threads {
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        for(int i=0;i<5;i++)
        {
        Process p=new Process(i);
        p.start();
        }
    }
}