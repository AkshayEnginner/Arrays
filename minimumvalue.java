import java.util.*;
class aks
{
    int a[] = {5,8,3,7,28,1};
    int min = a[0];
    
    void check()
    {
    for(int i=0;i<a.length;i++)
    {
        if(a[i]<min)
        {
            min=a[i];
        }
    }
    System.out.println("The maximum value in the list is " +min);
    }
}
class minimumvalue
{
    public static void main(String args[])
    {
        aks a = new aks();
        a.check();
    }
}