import java.util.*;
class array1
{
   public static void main(String args[])
   {
        int actual_sum=0;
        int expected_sum=0;
        int missing_no;
       int arr[]= {21,22,23,25,26,27,28,29,30};
       Scanner sc = new Scanner(System.in);
      
       for(int i=0;i<arr.length;i++)
       {
           actual_sum=actual_sum+arr[i];
       }
       for(int j=21;j<=30;j++)
       {
           expected_sum=expected_sum+j;
       }
       System.out.println("Actual sum is" +actual_sum);
       System.out.println("expected sum is " +expected_sum);
       
       missing_no=expected_sum-actual_sum;
       System.out.println("missing number is " +missing_no);
       
       
       
       
   }
}