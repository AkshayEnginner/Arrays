import java.util.*;
class array17
{
    public static void main(String args[])
    {
        int index,temp=0;
        int arr[] = {1,2,3,4,5,32,42,35};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index number to delete");
        index=sc.nextInt();
        //temp=arr[index];
        for(int i=0;i<arr.length-1;i++)
        {
            if(i==index)
            {
                 for(int j=i;j<arr.length-1;j++)
                 {
                      arr[j]=arr[j+1];
                 }
            }
          
        }
        for(int i=0;i<arr.length-1;i++)
        {
            System.out.println(arr[i]);
        }
        
    }
}