import java.util.*;
class aks
{
    int a[] = {2,3,4,5,6,7};
    int del =4;
    
    void check()
    {
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<a.length;i++)
        {
            if(del==a[i])
            {
                for(int j=i;j<a.length-1;j++)
                {
                    a[j]=a[j+1];
                }
                break;
            }
        }
         for (int i=0;i<a.length-1;i++)
         {
             System.out.println(a[i]);
         }
        
    }
}

class removeelement
{
    public static void main(String args[])
    {
        aks a = new aks();
        a.check();
    }
}