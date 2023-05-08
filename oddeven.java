import java.util.*;
class aks
{
    int a[]= {1,2,3,4,5,6,7,8,9,10};
    int total1,total2;
    int temp1=0;
    int temp2=0;
    
    ArrayList<Integer> a1= new ArrayList<>();
    ArrayList<Integer> a2= new ArrayList<>();
    
    void check()
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0 ;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
               a1.add(a[i]);
            }
            else
            {
               a2.add(a[i]);
            }
    
        }   
            System.out.print("The even numbers are ");
           for(int no : a1)
            {
                System.out.print(no+" ");
                temp1=temp1+no;
            }
            System.out.print("\n");
            System.out.print("The sum of even number is " +temp1);
             System.out.print("\n");
            System.out.print("The odd numbers are ");
             for(int no : a2)
            {
                System.out.print(no+" ");
                 temp2 = temp2+no;
            }
            System.out.print("\n");
            System.out.print("The sum of odd number is " +temp2);
             System.out.print("\n");
            System.out.print("Total even numbers are " + a1.size());
             System.out.print("\n");
            System.out.print("Total odd numbers are " + a2.size());
    
    }
}
class oddeven
{
    public static void main(String args[])
    {
        aks a = new aks();
        a.check();
    }
}