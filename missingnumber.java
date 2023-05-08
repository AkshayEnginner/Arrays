import java.util.*;
class aks
{
    int a[] = {1,2,3,4,5,7};
    int sum=0;
    
    
    void check()
    {
        Scanner sc = new Scanner(System.in);
        int exp_no_of_element=a.length+1;
        int total_sum=exp_no_of_element*(exp_no_of_element+1)/2;
        System.out.println("total_sum"  + total_sum);
        
        for(int i=0;i<a.length;i++)
        {
           sum=sum+a[i];
        }
        System.out.println("sum "  + sum);
        
        int missing_number = total_sum - sum;
        System.out.println("  missing_number " + missing_number);
    }
}
class missingnumber
{
    public static void main(String args[])
    {
        aks a = new aks();
   
        a.check();
    }
}