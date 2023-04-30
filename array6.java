import java.util.*;
class array6
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr1[] = {2,3,4,5,6,7,8};
        int arr2[] = {3,5,7,2,9,10,5};
        int a1 = arr1.length;
        int a2 = arr2.length;
        if(a1==a2)
        {
            System.out.println("equal size");
        }
        else
        {
            System.out.println("not equal size");
        }
    }
}