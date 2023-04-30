import java.util.*;
class array1314
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,56,8};
        int pos;
        int num;
        
       System.out.println("Enter the position");
       pos=sc.nextInt();
       System.out.println("Enter the number");
       num=sc.nextInt();
      
      arr[pos] = num;
      for(int i=0;i<arr.length;i++)
      {
          System.out.println(arr[i]);
      }
        
    }
}