import java.util.Scanner;

public class SelectionSort
{
    public void Ssort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int min=i;
            for (int j=i+1;j<arr.length;j++)
            {
                if(arr[min]>arr[j])
                {
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }

    }
    public void printArr(int arr[])
    {
        for (int i = 0; i <arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        SelectionSort obj=new SelectionSort();
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[sc.nextInt()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        obj.Ssort(arr);
        obj.printArr(arr);
    }
}

