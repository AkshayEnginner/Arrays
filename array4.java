import java.util.*;
class array4
{
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5,6,3,7,8,9,6};
        Scanner sc = new Scanner(System.in);
         System.out.println("Duplicate number are");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println(arr[i]);
                }
            }
        }
        
    }
}