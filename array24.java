import java.util.*;
class array24
{
    public static void main(String args[])
    {
        int arr[] = {1,2,6,3,7,8,7,4,6,9};
        int arr2[] = new int[arr.length];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length-1;j++)
            {
                if(arr[i]==arr[j])
                {
                   arr[j]=arr[j+1];
                }
            }
        }
         for(int i=0;i<arr.length-1;i++)
         {
             arr2[i]=arr[i];
         }
         for(int k=0;k<arr2.length-2;k++)
         {
             System.out.println(arr2[k]);
         }
      
    }
}