import java.util.Scanner;

public class BubbleSort
{
    public void Bsort(int a[])
    {
//        for (int i=0;i<arr.length-1;i++)
//        {
//            for (int j=0;j<arr.length-1-i;j++)
//            {
//                if(arr[j+1]<arr[j])
//                {
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
        int n = a.length;
        int i, j, temp;
        for (i = 0; i < n; i++)
        {
            for (j = i + 1; j < n; j++)
            {
                if (a[j] < a[i])
                {

                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    public void print(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        BubbleSort obj=new BubbleSort();
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[sc.nextInt()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        obj.Bsort(arr);
        obj.print(arr);
    }

}
