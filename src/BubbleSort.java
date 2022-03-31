import java.util.Scanner;

public class BubbleSort
{
    public void Bsort(int arr[])
    {
        for (int i=0;i<arr.length-1;i++)
        {
            for (int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j+1]<arr[j])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
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
