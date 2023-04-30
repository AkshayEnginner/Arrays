import java.util.*;
class array1516
{
    public static void main(String args[])
    {
        int num,temp=0;
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to delete");
        num=sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            if(num==arr[i])
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