import java.util.*;
class array9
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {42,2,86,45,20,69,54};
        int temp=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                
            }
           
        }
          for(int i=0;i<arr.length;i++)
          {
              System.out.println(arr[i]);
          }
          System.out.println("top two highest number are");
           System.out.println(arr[arr.length-1]);
            System.out.println(arr[arr.length-2]);
         
          
    }
}