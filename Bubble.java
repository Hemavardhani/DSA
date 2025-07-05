package DSA;
import java.util.*;

public class Bubble {
    public static void bubble(int a[])
    {
        int n=a.length;
        boolean swp;
        for(int i=0;i<n;i++)
        {
            swp=false;
            for(int j=0;j<n-i-1;j++)
            {
                   if(a[j+1]<a[j])
                   {
                    a[j]=a[j]+a[j+1];
                    a[j+1]=a[j]-a[j+1];
                    a[j]=a[j]-a[j+1];
                    swp=true;
                   }
            }
            if(!swp)
        {
            break;
        }
        }
        
    }
    public static void main(String[] args) {
        System.out.println("Enter the number");
        int n;
        Scanner sc=new Scanner(System.in);
        try{
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the number of elemnets");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("array before sorting");
        for(int j:a)
        {
            System.out.println(j);
        }
        bubble(a);
        System.out.println("array after sorts");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    catch(Exception e)
    {
        System.out.println("Something went wrong! "+e.getMessage());
    }
    finally{
        System.out.println("Bubble sorts completes");
    }


    }
    
}
