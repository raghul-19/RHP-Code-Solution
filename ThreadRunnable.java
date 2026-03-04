import java.util.*;
class Process implements Runnable
{
    int n;
    Process(int n)
    {
        this.n=n;
    }
    @Override
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
public class ThreadRunnable {
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        for(int i=0;i<5;i++)
        {
        Process p=new Process(i);
        Thread t=new Thread(p);
        t.start();
        }
    }
}