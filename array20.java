import java.util.*;
class array20
{
    public static void main(String args[])
    {
        
        int arr[] = {21,22,23,24,25,26,27,28,29,30};
        Scanner sc = new Scanner(System.in);
          System.out.println("odd numbers are" );
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==1)
            {
                 System.out.println(arr[i]);
            }
        }
      
      
        
    }
}